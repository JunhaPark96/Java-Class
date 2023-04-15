package test.library.refactor;

import static org.junit.Assert.assertEquals;
import java.time.*;
import org.junit.*;
import library.refactor.data.*;
import library.refactor.domain.model.*;

public class BookRepositoryImplTest {
    BookRepositoryImpl repository = new BookRepositoryImpl();
    LocalDate localDate = LocalDate.of(1996, 10, 15);
    LocalDate now = LocalDate.now();
    
    Book book1 = new Book("홍길동전", "미상", "한이음",  localDate, now);
    Book book2 = new Book("춘향전", "미상", "프로보노", localDate, now);
    Book book3 = new Book("사랑과전쟁", "윤정현", "민음사",  localDate, now);
    Book book4 = new Book("귀멸의칼날", "고토게 코요하루", "학산문화사", localDate, now);
    
    @Test
    public void testAddBook() {
        repository.addBook(book1);
        assertEquals(1, repository.findAll().size());
        repository.addBook(book2);
        assertEquals(2, repository.findAll().size());
        repository.addBook(book3);
        assertEquals(3, repository.findAll().size());
        repository.addBook(book4);
        assertEquals(4, repository.findAll().size());
    }
    
    @Test
    public void 도서대출기능테스트() {
        repository.addBook(book1);
        repository.addBook(book2);
        repository.addBook(book3);
        repository.addBook(book4);
        
        assertEquals(false, book1.isBorrowed());
        repository.borrowBook(book1);
        assertEquals(true, book1.isBorrowed());
        
        assertEquals(false, book2.isBorrowed());
        repository.borrowBook(book2);
        assertEquals(true, book2.isBorrowed());
        
        assertEquals(false, book3.isBorrowed());
    }
    
    @Test
    public void 연장기능테스트() {
        repository.addBook(book1);
        repository.addBook(book2);
        
        assertEquals(false, book1.isExtended());
        repository.borrowBook(book1);
        repository.dueDateExtend(book1);
        assertEquals(true, book1.isExtended());
    }

}
