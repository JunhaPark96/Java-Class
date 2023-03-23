package system.library;

import java.util.*;

public class Book {
    private String publishDate;
    private String name;
    private String author;
    private String isbn;
    private boolean isCheckedOut;
    
    public Book(String publishDate, String name, String author, String isbn, boolean isCheckedOut) {
        this.publishDate = publishDate;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.isCheckedOut = isCheckedOut;
    }
    
    public Book() {}

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void isCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    @Override
    public String toString() {
        return "책정보 출판날짜: " + publishDate + ", 책이름: " + name + ", 저자: " + author
                + ", isbn: " + isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, isbn, name, publishDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book other = (Book) obj;
        return Objects.equals(author, other.author) && Objects.equals(isbn, other.isbn)
                && Objects.equals(name, other.name)
                && Objects.equals(publishDate, other.publishDate);
    }
    
    
}
