package dayNineth;

import java.util.*;

public class BookMain {

    public static void main(String[] args) {
        
        /*
         * 1. 제목과 출간일이 같으면 같은 책으로 판단한다. 또한 HashSet 등의 컬렉션에 넣어도 동일 객체로 판단한다.
         * 2. Book 인스턴스를 담고 있는 컬렉션에 대해 Collections.sort() 를 사용하면 출간일이 오래된 순서대로 정렬된다.
         */
        
        Date now = new Date(); // 현재
        Date past = new Date(-1); // 과거
        List<Book> books = new ArrayList<>();
        Book book = new Book("사랑방 어머니", now, "굿");
        
        books.add(book);
//        System.out.println(books);
        
        Book book2 = book.clone();
        books.add(book2);
//        books.remove(book);
//        System.out.println(books);
        Collections.sort(books);
        
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getPublishDate());
        }
        
        
//        System.out.println(book3.getPublishDate());
        
    }

    

}
