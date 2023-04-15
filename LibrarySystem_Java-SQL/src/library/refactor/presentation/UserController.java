package library.refactor.presentation;

import java.sql.*;
import java.sql.Date;
import java.time.*;
import java.time.format.*;
import java.util.*;
import library.refactor.connection.*;
import library.refactor.domain.model.*;
import library.refactor.domain.repository.*;

public class UserController {
    private UserRepository userRepository;

    private boolean isExit = false;
    private Scanner scanner = new Scanner(System.in);
    private User lastDeletedUser = null;
    private JDBC jdbc = JDBC.getInstance();
    
    
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void printMenu() {
        while (!isExit) {
            System.out.println("1. 유저등록, 2. 유저목록, 3. 유저수정, 4. 유저삭제, 5. 삭제취소 0. 뒤로");
            int target = scanner.nextInt();
            if (target == 1) {
                addUser();
            } else if (target == 2) {
                printUserList();
            } else if (target == 3) {
                updateUser();
            } else if (target == 4) {
                deleteUser();
            } else if (target == 5) {
                undoDelete();
            } else if (target == 0){
                isExit = true;
            } else {
                System.out.println("다시 입력해주십시오");
            }
        }
    }

    public void printUserList() {
        try {
            Connection conn = jdbc.getConnection(); // jdbc연결 가져오기
            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("select * from libuser");
            ResultSet rs = stmt.executeQuery("select id, name, "
                    + "extract(year from sysdate) - extract(year from birthDate) + 1 as age, "
                    + "address, contact, birthDate, joinDate from libuser");
            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String address = rs.getString(4);
                String contact = rs.getString(5);
                Date birthDate = rs.getDate(6);
                Date joinDate = rs.getDate(7);
                System.out.println(
                        rs.getString("id") + " " + rs.getString("name") + " " + rs.getInt("age")
                                + " " + rs.getString("address") + " " + rs.getString("contact")
                                + " " + rs.getString("birthDate") + " " + rs.getString("joinDate"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // connection 종료 안함
        }

//        try {
//            Connection conn = jdbc.getConnection();
//            String sql = "select * from libuser order by id";
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//            ResultSet rs = pstmt.executeQuery();
//
//            while (rs.next()) {
//                String id = rs.getString(1);
//                String name = rs.getString(2);
//                int age = rs.getInt(3);
//                String address = rs.getString(4);
//                String contact = rs.getString(5);
//                Date birthDate = rs.getDate(6);
//                Date joinDate = rs.getDate(7);
//                System.out.println(id + " " + name + " " + age + " " 
//                + address + " " + contact + " " + birthDate + " " + joinDate);
//            }
//            pstmt.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // connection 종료 안함
//        }

    }

    public void addUser() {
        try {
          Connection conn = jdbc.getConnection(); // jdbc연결 가져오기
          conn.setAutoCommit(false);
          
          System.out.println("이름을 입력하세요");
          String name = scanner.next();
          System.out.println("주소를 입력하세요");
          String address = scanner.next();
          System.out.println("전화번호를 입력하세요");
          String contact = scanner.next();
          System.out.println("생년월일을 입력하세요 (YYYY-MM-DD)");
          String birthDate = scanner.next();
          
          String sql = String.format("insert into libuser(id, name, address, contact, birthDate) "
                  + "values(to_char(libuser_seq.nextval, '00000000'), '%s', '%s', '%s', to_date('%s', 'rr/mm/dd'))",
                  name, address, contact, birthDate);
         
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

    public void updateUser() {
        // 파일에 넣어주기
        // preparedStatement
        System.out.println("수정할 유저의 id를 입력하세요");
        String id = scanner.next();
        
        try {
            Connection conn = jdbc.getConnection();
            conn.setAutoCommit(false);
            PreparedStatement pstmt = null;
            System.out.println("어떤 정보를 수정하시겠습니까?");
            System.out.println("1. 이름 2. 나이 3. 주소 4. 전화번호 5. 생일");
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.println("새로운 이름을 입력해주세요");
                    String newName = scanner.next();
                    pstmt = conn.prepareStatement("update libuser set name = ? where id = ?");
                    pstmt.setString(1, newName);
                    pstmt.setString(2, id);
                    break;
                case 2:
                    System.out.println("새로운 나이를 입력해주세요");
                    String newAge = scanner.next();
                    pstmt = conn.prepareStatement("update libuser set age = ? where id = ?");
                    pstmt.setString(1, newAge);
                    pstmt.setString(2, id);
                    break;
                case 3:
                    System.out.println("새로운 주소를 입력하세요");
                    String newAddress = scanner.next();
                    pstmt = conn.prepareStatement("update libuser set address = ? where id = ?");
                    pstmt.setString(1, newAddress);
                    pstmt.setString(2, id);
                    break;
                case 4:
                    System.out.println("새로운 번호를 입력하세요");
                    String newContact = scanner.next();
                    pstmt = conn.prepareStatement("update libuser set contact = ? where id = ?");
                    pstmt.setString(1, newContact);
                    pstmt.setString(2, id);
                    break;
                case 5:
                    System.out.println("새로운 생일을 입력하세요 (yy/mm/dd)");
                    String birthDate = scanner.next();
                    pstmt = conn.prepareStatement("update libuser set birthDate(?, 'rr/mm/dd') where id = ?");
                    pstmt.setString(1, birthDate);
                    pstmt.setString(2, id);
                    break;
                default:
                    System.out.println("잘못된 입력입니다");
                    return;
            }

            int result = pstmt.executeUpdate();
            if (result == 1) {
                System.out.println("유저 정보가 수정되었습니다.");
            } else {
                System.out.println("유저 정보 수정에 실패했습니다.");
            }
            conn.commit();
            pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteUser() {
        //pstmt
        try {
            Connection conn = jdbc.getConnection();
            conn.setAutoCommit(false);
            System.out.println("몇번 id를 삭제하시겠어요?");
            String deleteTarget = scanner.next();
            
            String sql = "delete from libuser where id = ?";
           
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
        
         //statement
//        try {
//            Connection conn = jdbc.getConnection();
//            conn.setAutoCommit(false);
//            System.out.println("몇번 id를 삭제하시겠어요?");
//            String deleteTarget = scanner.next();
//
//            Statement stmt = conn.createStatement();
//            String sql = "DELETE FROM libuser WHERE id=\'" + deleteTarget + "\'";
//            int result = stmt.executeUpdate(sql);
//            System.out.println(result + "개가 삭제되었습니다");
//            
//            conn.commit();
//            stmt.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            // connection 종료 안함
//        }
    }


    public void undoDelete() {
        userRepository.addUser(lastDeletedUser);
        System.out.println(lastDeletedUser.getId() + "번 id가 복구되었습니다");
    }


}
