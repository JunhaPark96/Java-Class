package library.refactor.domain.model;

import java.util.*;

public class Book {
    // id, title, author, publisher, publishDate, registrationDate 필드, getter setter 생성
    private int id;
    private String title;
    private String author;
    private String publisher;
    private Date publishedDate;
    private Date registrationDate;
    
    public Book(int id, String title, String author, String publisher, Date publishedDate,
            Date registrationDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.publishedDate = publishedDate;
        this.registrationDate = registrationDate;
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
    public Date getPublishedDate() {
        return publishedDate;
    }
    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
    public Date getRegistrationDate() {
        return registrationDate;
    }
    public void setRegistrationDate(Date registrationDate) {
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
        return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher="
                + publisher + ", publishedDate=" + publishedDate + ", registrationDate="
                + registrationDate + "]";
    }
    
    
}
