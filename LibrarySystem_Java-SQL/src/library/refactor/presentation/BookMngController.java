package library.refactor.presentation;

import java.sql.*;
import java.sql.Date;
import java.time.*;
import java.util.*;
import library.refactor.connection.*;
import library.refactor.domain.model.*;
import library.refactor.domain.repository.*;

public class BookMngController {
    private boolean isExit = false;
    private Scanner scanner = new Scanner(System.in);
    private JDBC jdbc = JDBC.getInstance();

    public void printMenu() {
        while (!isExit) {
            System.out.println("1.대출목록 2.도서대출 3.대출연장 4.도서반납 0.뒤로");
            int target = scanner.nextInt();

            if (target == 1) {
                showBorrowedList();
            } else if (target == 2) {
                borrowBook();
            } else if (target == 3) {
                dueDateExtend();
            } else if (target == 4) {
                returnBook();
            } else {
                isExit = true;
            }
        }
    }

    private void showBorrowedList() {
        try {
            Connection conn = jdbc.getConnection();
            String sql = "select * from bookManagement order by duedate desc";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                String rentId = rs.getString(1);
                String userID = rs.getString(2);
                String userName = rs.getString(3);
                int bookID = rs.getInt(4);
                String bookName = rs.getString(5);
                Date duedate = rs.getDate(6);
                String extendStatus = rs.getString(7);
                String returnStatus = rs.getString(8);
                
                System.out.println(rentId + " " + userID + " " + userName + " " 
                + bookID + " " + bookName + " " + duedate + " " + extendStatus
                + " " + returnStatus);
            }
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // connection 종료 안함
        }
    }

    public void borrowBook() {
        try {
            Connection conn = jdbc.getConnection();
            conn.setAutoCommit(false);
            
            System.out.println("대출할 책 ID를 입력해주세요");
            int bookID = scanner.nextInt();
            String sql =
                    "select count(*) as count from book where id = ? and borrowStatus = '대출가능'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bookID);
            ResultSet rs = pstmt.executeQuery();
            rs.next(); // 행 이동
            int count = rs.getInt("count"); // count 개수 get

            if (count == 1) { // 대출 가능여부 확인 1이면 대출 가능
                // book 테이블의 borrowStatus 업데이트 대출가능 -> 대출불가
                sql = "update book set borrowStatus = '대출불가' where id = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, bookID);
                pstmt.executeUpdate();
                // bookManagement 테이블에 대출 상태 insert
                sql = "insert into bookManagement(rentID, userID, userName, bookID, bookName) "
                        + "select to_char(bookManagement_seq.nextval), u.id, u.name, b.id, b.title "
                        + "from libuser u, book b " + "where b.id = ? and u.id = ?";
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, bookID);
                System.out.println("대출할 유저 ID를 입력해주세요");
                String userID = scanner.next();
                pstmt.setString(2, userID);
                int result = pstmt.executeUpdate();
                if (result == 1) {
                    System.out.println("도서 대출이 완료되었습니다.");
                } else {
                    System.out.println("도서 대출에 실패했습니다.");
                }
            } else { // 대출불가
                System.out.println("이미 대출중인 도서입니다.");
            }
            conn.commit();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // connection 종료 안함
        }
    }

    public void dueDateExtend() {
        try {
            Connection conn = jdbc.getConnection();
            conn.setAutoCommit(false);
            
            System.out.println("연장할 책 ID를 입력해주세요");
            int bookID = scanner.nextInt();
            String sql =
                    "select count(*) as count "
                    + "from bookManagement "
                    + "where bookId = ? and extendStatus = '연장가능'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bookID);
            ResultSet rs = pstmt.executeQuery();
            rs.next(); // 행 이동
            int count = rs.getInt("count"); // count 개수 get

            if (count == 1) { // 연장 가능여부 확인 1이면 연장 가능
                // 대출기간 7일 연장 및 연장상태 불가로 변경
                sql = "update bookManagement "
                        + "set duedate = duedate + 7, extendStatus = '연장불가'";
                pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();
                System.out.println("일주일 연장되었습니다");
            } else { // 연장불가
                System.out.println("이미 연장한 도서입니다.");
            }
            conn.commit();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // connection 종료 안함
        }
    }
    
    public void returnBook() {
        try {
            Connection conn = jdbc.getConnection();
            conn.setAutoCommit(false);
            
            System.out.println("반납할 책 ID를 입력해주세요");
            int bookID = scanner.nextInt();
            
            String sql = "update book set borrowStatus = '대출가능' where id = ? and borrowStatus = '대출불가'";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bookID);
            int count = pstmt.executeUpdate();

            if (count == 1) {
                sql = "delete from bookManagement where bookId = ? and returnStatus = '미반납'";
                pstmt = conn.prepareStatement(sql);
                pstmt.setInt(1, bookID);
                count = pstmt.executeUpdate();

                if (count == 1) {
                    System.out.println("반납이 완료되었습니다.");
                } else {
                    System.out.println("반납 처리 중 오류가 발생하였습니다.");
                }
            } else {
                System.out.println("대출중인 도서가 아닙니다.");
            }
//            String sql =
//                    "select count(*) as count from book where id = ? and borrowStatus = '대출불가'";
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setInt(1, bookID);
//            ResultSet rs = pstmt.executeQuery();
//            rs.next(); // 행 이동
//            int count = rs.getInt("count"); // count 개수 get
//
//            if (count == 1) { // 반납 가능여부 확인 1이면 반납 가능
//                // book 테이블의 borrowStatus 업데이트 대출불가 -> 대출가능
//                sql = "update book set borrowStatus = '대출가능' where id = ?";
//                pstmt = conn.prepareStatement(sql);
//                pstmt.setInt(1, bookID);
//                pstmt.executeUpdate();
//                // 대출 테이블에서 행 삭제
//                sql = "delete from bookManagement where bookId = ? and returnStatus = '미반납'";
//                pstmt = conn.prepareStatement(sql);
//                pstmt.setInt(1, bookID);
//                pstmt.executeUpdate();
//                
//                System.out.println("반납이 완료되었습니다");
//            } else { // 반납불가
//                System.out.println("대출중인 도서가 아닙니다");
//            }
            conn.commit();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // connection 종료 안함
        }
    }

}
