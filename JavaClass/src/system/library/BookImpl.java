package system.library;

import java.text.*;
import java.util.*;
import java.util.stream.*;

public class BookImpl implements BookManagement {
    Scanner scanner = new Scanner(System.in);
    private List<Book> bookList;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    private String fileName = "bookInfo.txt";

    public BookImpl() {
        bookList = BookFileHandler.csvReader(fileName);
    }

    @Override
    public void showBookList() {
        System.out.println("대출 가능한 책 목록:");
        getAvailableBooks().forEach(System.out::println);
    }


    @Override
    public void dueDateExtend() {
        System.out.println("연장할 도서명을 입력하세요.");
        String bookName = scanner.nextLine();
        for (Book book : bookList) {
            if (book.getName().equals(bookName) && !book.isCheckedOut()) {
                Calendar calendar = Calendar.getInstance();
                calendar.add(Calendar.DATE, 7);
                String newDueDate = dateFormat.format(calendar.getTime());
                book.setPublishDate(newDueDate);
                System.out.println(bookName + " 연장완료, 대출기간은 " + newDueDate + "까지 입니다.");
                List<Book> updatedBookList = new ArrayList<>(bookList);
                BookFileHandler.csvWriter(updatedBookList, fileName);
                return;
            }
        }
        System.out.println("연장할 수 없는 도서입니다.");
    }

    private List<Book> getAvailableBooks() {
        return bookList.stream().filter(book -> !book.isCheckedOut()).collect(Collectors.toList());
    }
    
    @Override
    public void borrowBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("대출할 도서명을 입력하세요:");
        String bookName = scanner.nextLine();

        List<Book> availableBooks = getAvailableBooks().stream()
                .filter(book -> book.getName().equalsIgnoreCase(bookName))
                .collect(Collectors.toList());

        if (availableBooks.isEmpty()) {
            System.out.println("대출할 수 없는 도서입니다.");
            return;
        }

        System.out.println("대출하실 도서의 번호를 입력하세요:");
        for (int i = 0; i < availableBooks.size(); i++) {
            System.out.println((i + 1) + ". " + availableBooks.get(i).getName());
        }

        int bookIndex = scanner.nextInt() - 1;

        if (bookIndex < 0 || bookIndex >= availableBooks.size()) {
            System.out.println("잘못된 도서 번호입니다.");
            return;
        }

        Book selectedBook = availableBooks.get(bookIndex);

        System.out.println("대출자명을 입력하세요:");
        // 미완성
    }

    public List<Book> sortByPublishDate() {
        return bookList.stream().filter(book -> !book.isCheckedOut())
                .sorted(Comparator.comparing(Book::getPublishDate).reversed())
                .collect(Collectors.toList());
    }

    public List<Book> searchBook(String name) {
        List<Book> result = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getName().equals(name)) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public void removeBook(Book book) {
        bookList.remove(book);
        BookFileHandler.csvWriter(bookList, fileName);
        BookFileHandler.csvDeletedWriter(Arrays.asList(book), "bookInfo_deleted.txt");
    }

    @Override
    public void addBook() {
        System.out.print("도서 제목을 입력하세요: ");
        String name = scanner.next();
        System.out.print("저자를 입력하세요: ");
        String author = scanner.next();
        System.out.print("출판사를 입력하세요: ");
        String publisher = scanner.next();
        System.out.print("출판일을 입력하세요(yyyy/MM/dd): ");
        String publishDate = scanner.next();
        Book book = new Book(name, author, publisher, publishDate, false);
        bookList.add(book);
        BookFileHandler.csvWriter(bookList, fileName);
        // Book book = new Book();
        //
        // System.out.println("책 이름을 입력하세요");
        // String name = scanner.next();
        // book.setName(name);
        //
        // System.out.println("책 저자를 입력하세요");
        // String author = scanner.next();
        // book.setName(author);
        //
        // System.out.println("isbn을 입력하세요");
        // String isbn = scanner.next();
        // book.setName(isbn);
        //
        // String publishedDate;
        // SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        // Calendar time = Calendar.getInstance();
        // publishedDate = format.format(time.getTime());
        // book.setPublishDate(publishedDate);
        //
        // if (bookList == null) {
        // bookList = new ArrayList<>();
        // }
        // bookList.add(book);
        // BookFileHandler.csvWriter(bookList, fileName);

    }


}
