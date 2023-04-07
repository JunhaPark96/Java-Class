package library.refactor.domain.model;

import java.time.*;
import java.util.*;
import java.util.concurrent.atomic.*;

public class Book {
    // id, title, author, publisher, publishDate, registrationDate 필드, getter setter 생성
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    private int id;
    private String title;
    private String author;
    private String publisher;
    private LocalDate publishedDate;
    private LocalDate registrationDate;
    private boolean isBorrowed = false;
    
    public Book(String title, String author, String publisher, LocalDate publishedDate,
            LocalDate registrationDate) {
        this.id = ID_GENERATOR.getAndIncrement();;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.registrationDate = registrationDate;
        this.isBorrowed = isBorrowed;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public LocalDate getPublishedDate() {
        return publishedDate;
    }
    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }
    public LocalDate getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }
    @Override
    public int hashCode() {
        return Objects.hash(author, id, publishedDate, publisher, registrationDate, title);
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
        return Objects.equals(author, other.author) && id == other.id
                && Objects.equals(publishedDate, other.publishedDate)
                && Objects.equals(publisher, other.publisher)
                && Objects.equals(registrationDate, other.registrationDate)
                && Objects.equals(title, other.title);
    }
    @Override
    public String toString() {
        return "Book id: " + id + ", 제목: " + title + ", 저자: " + author + ", 출판사: "
                + publisher + ", 출판일: " + publishedDate + ", 등록일: "
                + registrationDate;
    }
    
    
}
