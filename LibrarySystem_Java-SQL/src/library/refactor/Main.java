package library.refactor;

import java.sql.*;
import java.util.*;
import library.refactor.connection.*;
import library.refactor.data.*;
import library.refactor.presentation.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JDBC jdbc = JDBC.getInstance();
        
        UserController userController = new UserController(
                new UserRepositoryImpl());
        
        BookController bookController = new BookController(
                new BookRepositoryImpl());
        
        BookMngController bookMngController = new BookMngController();
        
        boolean isExit = false;
        while (!isExit) {
            System.out.println("기능을 선택해주세요. 1. 회원관리 2. 도서관리 3. 대출관리 4. 종료");
            int target = scanner.nextInt();
            
            if (target == 1) {
                userController.printMenu();
            } else if (target == 2) {
                bookController.printMenu();
            } else if (target == 3) {
                bookMngController.printMenu();
            } else if (target == 4) {
                jdbc.closeConnection(); // jdbc 해제
                jdbc.isClosed();        // 연결해제 확인
                isExit = true;
            } else {
                System.out.println("다시 입력하세요");
            }
        }
    }

}
