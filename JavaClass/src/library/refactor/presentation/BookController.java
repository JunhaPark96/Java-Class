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
        List<Book> bookList = bookRepository.findAll();
        Book book = null;
        for (Book e : bookList) {
            if(e.isBorrowed() == false) {
                System.out.println(e);
            }
        }
    }
    
    public void borrowBook() {
        int bookId = bookId();
        List<Book> bookList = bookRepository.findAll();
        Book book = null;
        for (Book e : bookList) {
            if(e.getId() == bookId) {
                book = e;
                break;
            }
        }
        if (book != null && book.isBorrowed() == false) {
            bookRepository.borrowBook(book);
            System.out.println(book.getTitle() + "이(가) 대출되었습니다");
        } else if (book.isBorrowed() == true) {
            System.out.println("해당 도서는 대출 중입니다");
        } else {
            System.out.println("해당 도서가 존재하지 않습니다");
        }
        System.out.println(book.toString());
    }
    
    public void dueDateExtend() {
        int bookId = bookId();
        List<Book> bookList = bookRepository.findAll();
        Book book = null;
        for (Book e : bookList) {
            if(e.getId() == bookId) {
                book = e;
                break;
            }
        }
        
        if (book != null && book.isExtended() == false) {
            bookRepository.dueDateExtend(book);
            System.out.println(book.getTitle() + "이(가) 1주일 연장되었습니다");
        } else {
            System.out.println("해당 도서는 대출연장할 수 없습니다");
        }
        System.out.println(book.toString());
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
    
    public String bookTitle() {
        System.out.println("대출하려는 도서 제목을 입력해주세요");
        return scanner.next();
    }
    
    public int bookId() {
        System.out.println("대출하려는 도서 ID를 입력해주세요");
        return scanner.nextInt();
    }
}
