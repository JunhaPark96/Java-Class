package library.refactor.presentation;

import java.util.*;
import library.refactor.domain.repository.*;

public class BookController {
    private BookRepository bookRepository;
    private boolean isExit = false;
    private Scanner scanner = new Scanner(System.in);
    
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    public void printMenu() {
        while (!isExit) {
            System.out.println("1.도서목록 2.도서대출 3.대출연장 4.새책입력 0.뒤로");
            int target = scanner.nextInt();
            
            if (target == 1) {
                showBookList();
            } else if (target == 2) {
                borrowBook();
            } else if (target == 3) {
                dueDateExtend();
            } else if (target == 4) {
                addBook();
            } else {
                isExit = true;
            }
        }
    }
    
    public void showBookList() {
        
    }
    
    public void borrowBook() {
        
    }
    
    public void dueDateExtend() {
        
    }
    
    public void addBook() {
        
    }
}
