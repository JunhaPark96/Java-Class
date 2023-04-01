package library.refactor.domain.repository;

import java.util.*;
import library.refactor.domain.model.*;

public interface BookRepository {
    void showBookList(Book book);
    
    void addBook(Book book);
    
    int deleteBook(int id);
    
    void borrowBook();
    
    void dueDateExtend();
    
    List<Book> findAll();
}
