package library.refactor.presentation;

import java.time.*;
import java.util.*;
import library.refactor.domain.model.*;
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
        System.out.println(bookRepository.findAll());
    }
    
    public void borrowBook() {
        
    }
    
    public void dueDateExtend() {
        
    }
    
    public void addBook() {
        System.out.println("이름을 입력하세요");
        String name = scanner.next();
        System.out.println("저자를 입력하세요");
        String author = scanner.next();
        System.out.println("출판사를 입력하세요");
        String publisher = scanner.next();
        System.out.println("출판일을 입력하세요 (YYYY-MM-DD)");
        String publishedDate = scanner.next();
        LocalDate publishedDay = LocalDate.parse(publishedDate);
        LocalDate registrationDay = LocalDate.now();
        
        bookRepository.addBook(new Book(name, author, publisher, publishedDay, registrationDay));
        System.out.println(bookRepository.findAll());
    }
}
