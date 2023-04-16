package library.refactor.presentation;

import java.sql.*;
import java.sql.Date;
import java.time.*;
import java.util.*;
import library.refactor.connection.*;
import library.refactor.domain.model.*;
import library.refactor.domain.repository.*;

public class BookController {
    private BookRepository bookRepository;
    private boolean isExit = false;
    private Scanner scanner = new Scanner(System.in);
    private JDBC jdbc = JDBC.getInstance();
    
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public void printMenu() {
        while (!isExit) {
            System.out.println("1.도서목록 2.새책입력 3.도서삭제 0.뒤로");
            int target = scanner.nextInt();
            
            if (target == 1) {
                showBookList();
            } else if (target == 2) {
                addBook();
            } else if (target == 3) {
                deleteBook();
            } else {
                isExit = true;
            }
        }
    }

    public void showBookList() {
        System.out.println("책ID isbn 책이름 작가 출판사 출판일 등록일 대출상태");
        try {
            Connection conn = jdbc.getConnection();
            String sql = "select * from book order by publishedDate desc";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()) {
                String id = rs.getString(1);
                String isbn = rs.getString(2);
                String title = rs.getString(3);
                String author = rs.getString(4);
                String publisher = rs.getString(5);
                Date publishedDate = rs.getDate(6);
                Date registrationDate = rs.getDate(7);
                String borrowStatus = rs.getString(8);
                System.out.println(id + " " + isbn + " " + title + " " 
                + author + " " + publisher + " " + publishedDate + " " + registrationDate
                + " " + borrowStatus);
            }
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // connection 종료 안함
        }
    }
    
//    public boolean isBookAvailable(int bookID) {
//        try {
//            Connection conn = jdbc.getConnection();
//            String sql = "select borrowStatus from book where id = ?";
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            pstmt.setInt(1, bookID);
//            ResultSet rs = pstmt.executeQuery();
//            
//            if (borrowStatus.equals("대출불가")) {
//                return false;
//            } else { // borrowStatus.equals("대출가능")
//                return true;
//            }
//            
//            pstmt.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // connection 종료 안함
//        }
//    }
    
    public void addBook() {
        try {
            Connection conn = jdbc.getConnection(); // jdbc연결 가져오기
            conn.setAutoCommit(false);
            
            System.out.println("isbn을 입력하세요");
            String isbn = scanner.next();
            scanner.nextLine();
            System.out.println("책 제목을 입력하세요");
            String title = scanner.nextLine();
//            scanner.nextLine();
            System.out.println("작가를 입력하세요");
            String author = scanner.nextLine();
//            scanner.nextLine();
            System.out.println("출판사를 입력하세요");
            String publisher = scanner.nextLine();
//            scanner.nextLine();
            System.out.println("출판날짜를 입력하세요 (YYYY/MM/DD)");
            String publishedDate = scanner.next();
            
            String sql = String.format("insert into book(id, isbn, title, author, publisher, publishedDate) "
                    + "values(book_seq.nextval, '%s', '%s', '%s', '%s', to_date('%s', 'rr/mm/dd'))",
                    isbn, title, author, publisher, publishedDate);
           
            Statement stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            System.out.println(result + "개가 입력되었습니다");
            conn.commit();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // connection 종료 안함
        }
    }
    
    private void deleteBook() {
        try {
            Connection conn = jdbc.getConnection();
            conn.setAutoCommit(false);
            System.out.println("몇번 id를 삭제하시겠어요?");
            String deleteTarget = scanner.next();
            
            String sql = "delete from book where id = ?";
           
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, deleteTarget);
            int result = pstmt.executeUpdate();
            System.out.println(result + "개가 삭제되었습니다");
            conn.commit();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // connection 종료 안함
        }
    }

}
