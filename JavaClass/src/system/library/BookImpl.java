package system.library;

import java.text.*;
import java.util.*;

public class BookImpl implements BookManagement{
    private List<Book> bookList;
    Scanner scanner = new Scanner(System.in);
    private String fileName = "bookInfo.txt";
    
    public BookImpl() {
        bookList = new ArrayList<>();
    }
    
    @Override
    public void bookList() {
        System.out.println("대출 가능한 책 목록:");
        List<Book> bookList = BookFileHandler.csvReader(fileName);
        for (Book book : bookList) {
            if (!book.isCheckedOut()) {
                System.out.println(book.toString());
            }
        }
    }

    @Override
    public void borrowBook() {
        
    }

    @Override
    public void dueDateExtend() {
        
    }

    @Override
    public void addBook() {
        Book book = new Book();
        
        System.out.println("책 이름을 입력하세요");
        String name = scanner.next();
        book.setName(name);
        
        System.out.println("책 저자를 입력하세요");
        String author = scanner.next();
        book.setName(author);
        
        System.out.println("isbn을 입력하세요");
        String isbn = scanner.next();
        book.setName(isbn);
        
        String publishedDate;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Calendar time = Calendar.getInstance();
        publishedDate = format.format(time.getTime());
        book.setPublishDate(publishedDate);
        
        if (bookList == null) {
            bookList = new ArrayList<>();
        }
        bookList.add(book);
        BookFileHandler.csvWriter(bookList, fileName);
        
    }

}
