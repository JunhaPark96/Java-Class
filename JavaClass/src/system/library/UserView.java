package system.library;

import java.util.*;

public class UserView {
    Scanner scanner = new Scanner(System.in);
    UserImpl userImpl = new UserImpl();

    public void userView() {
        while (true) {
            System.out.print("1.회원등록 2.회원조회 3.회원수정 4.회원삭제 5.삭제취소 0.뒤로");
            int choice = scanner.nextInt();
            
            if (choice == 0) {
                break;
            }
            if (choice == 1) {
                System.out.println("회원 정보를 입력하세요.");
                userImpl.enroll();
            } else if (choice == 2) {
                userImpl.userSearchAll();
            } else if (choice == 3) {
                userImpl.edit();
            } else if (choice == 4) {
                userImpl.delete();
            } else if (choice == 5) {
                userImpl.undoDelete();
            } else {
                System.out.println("0 ~ 5사이의 숫자를 입력해 주세요");
            }
        }

    }

}
