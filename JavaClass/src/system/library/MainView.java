package system.library;

import java.util.*;
import system.library.UserView;
public class MainView {
    Scanner scanner = new Scanner(System.in);
    private UserView userView;
    private BookView bookView;
    
    
    public void mainView() {        
        while(true){
            System.out.println("1. 회원관리\t2. 도서관리\t3. 종료");
            int choice = scanner.nextInt();
            if (choice == 1) {
                UserView userView = new UserView();
                userView.userView();
            } else if (choice == 2) {
                BookView bookView = new BookView();
                bookView.bookView();
            } else if (choice == 3) {
                System.out.println("종료");
                break;
            } else {
                System.out.println("1 ~ 3번 중 하나를 골라 주십시오");
            }
        }
    }
}
