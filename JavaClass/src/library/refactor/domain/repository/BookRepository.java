package library.refactor.domain.repository;

import java.util.*;
import library.refactor.domain.model.*;

public interface BookRepository {
    void showBookList(Book book);
    
    void addBook(Book book);
    
    int deleteBook(int id);
    
    void borrowBook(Book book);
    
    void dueDateExtend(Book book);
    
    Book findByTitle(String title);
    
    Book findById(int id);
    
    List<Book> findAll();
}
