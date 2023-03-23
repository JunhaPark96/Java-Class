package system.library;

import java.util.*;

public class BookView {
    Scanner scanner = new Scanner(System.in);
    BookImpl bookImpl = new BookImpl();
    
    public void bookView() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1.도서목록 2.도서대출 3.대출연장 4.새책입력 0.뒤로");
            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }
            if (choice == 1) {
                System.out.println("대출 가능한 도서 목록입니다");
                bookImpl.bookList();
            } else if (choice == 2) {
                bookImpl.borrowBook();
            } else if (choice == 3) {
                bookImpl.dueDateExtend();
            } else if (choice == 4) {
                bookImpl.addBook();
            } else {
                System.out.println("0 ~ 3사이의 숫자를 입력해 주세요");
            }
        }

    }
}

