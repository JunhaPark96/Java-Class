package dayNineth;

import java.util.*;

public class Book implements Comparable<Book>, Cloneable{
    private String title;
    private Date publishDate;
    private String comment;
       
    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }
    
    // 1. 제목과 출간일이 같으면 같은책 + HashSet 등의 컬렉션에 넣어도 동일 객체
    @Override
    public int hashCode() {
        return Objects.hash(publishDate, title);
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
        return Objects.equals(publishDate, other.publishDate) && Objects.equals(title, other.title);
    }
    @Override
    public Book clone() {
        Book copyBook = new Book(comment, publishDate, comment);
        copyBook.title = title;
        copyBook.publishDate = publishDate;
        copyBook.comment = comment;
        return copyBook;
    }
    
    @Override
    public int compareTo(Book book) {
        return this.getPublishDate().compareTo(book.publishDate);
    }
    
    
    
    public String getTitle() {
        return title;
    }
    

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
