package system.book;

import java.util.*;

public class BookInfo {
    private Calendar publishDate;
    private String name;
    private String author;
    private String isbn;
    
    public BookInfo(Calendar publishDate, String name, String author, String isbn) {
        this.publishDate = publishDate;
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    public Calendar getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Calendar publishDate) {
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

    @Override
    public String toString() {
        return "BookInfo [publishDate=" + publishDate + ", name=" + name + ", author=" + author
                + ", isbn=" + isbn + "]";
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
        BookInfo other = (BookInfo) obj;
        return Objects.equals(author, other.author) && Objects.equals(isbn, other.isbn)
                && Objects.equals(name, other.name)
                && Objects.equals(publishDate, other.publishDate);
    }
    
    
}
