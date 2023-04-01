package library.refactor;

import java.util.*;
import library.refactor.data.*;
import library.refactor.presentation.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        UserController userController = new UserController(
                new UserRepositoryImpl());
        
        BookController bookController = new BookController(
                new BookRepositoryImpl());
        
        boolean isExit = false;
        while (!isExit) {
            System.out.println("기능을 선택해주세요. 1. 회원관리 2. 도서관리 3. 종료");
            int target = scanner.nextInt();
            
            if (target == 1) {
                userController.printMenu();
            } else if (target == 2) {
                bookController.printMenu();
            } else if (target == 3) {
                System.exit(0);
            } else {
                System.out.println("다시 입력하세요");
            }
        }
    }

}
