package library.refactor.data;

import java.time.*;
import java.util.*;
import library.refactor.domain.model.*;
import library.refactor.domain.repository.*;

public class BookRepositoryImpl implements BookRepository{
    private DataDAO<Book> data;
    private List<Book> books = new ArrayList<>();
    
    
    public BookRepositoryImpl() {
    }

    public BookRepositoryImpl(DataDAO<Book> data, List<Book> books) {
        this.data = data;
        this.books = books;
    }

    @Override
    public void showBookList(Book book) {
        
    }

    @Override
    public void addBook(Book book) {
        int index = -1;
        for (int i = 0; i < books.size(); i++) {
            Book e = books.get(i);
            if (e.getId() == book.getId()) {
                index = i;
                break;
            }
        }
        
        if (index == -1) {
            books.add(book);
            if (data != null) {
                data.save(books);
            }
        } else {
            books.set(index, book);
            if (data != null) {
                data.save(books);
            }
        }
    }
    @Override
    public void borrowBook(Book book) {
        Book borrowedBook = findById(book.getId());
        if (borrowedBook != null && borrowedBook.isBorrowed() == false) {
            borrowedBook.setBorrowed(true);
            LocalDate today = LocalDate.now();
            LocalDate returnDate = today.plusWeeks(2);
            borrowedBook.setDueDate(returnDate);
            borrowedBook.toString();
        } else {
            borrowedBook.isBorrowed();
        }
    }
    
    @Override
    public void dueDateExtend(Book book) {
        Book borrowedBook = findById(book.getId());
        if (borrowedBook != null && borrowedBook.isExtended() == false) {
            borrowedBook.setExtended(true);
            LocalDate newReturnDate = borrowedBook.getDueDate().plusWeeks(1);
            borrowedBook.setDueDate(newReturnDate);
            borrowedBook.toString();
        } else {
            borrowedBook.isExtended();
        }
    }
    
    @Override
    public Book findByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }
    
    @Override
    public Book findById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public int deleteBook(int id) {
        // TODO Auto-generated method stub
        return 0;
    }
}
