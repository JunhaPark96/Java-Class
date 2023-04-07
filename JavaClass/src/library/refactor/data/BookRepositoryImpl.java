package library.refactor.data;

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
    public int deleteBook(int id) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void borrowBook() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void dueDateExtend() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

    
}
