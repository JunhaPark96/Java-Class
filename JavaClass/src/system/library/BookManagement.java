package system.library;

import java.util.*;

public interface BookManagement {
    void showBookList();

    void dueDateExtend();

    void addBook();

    void removeBook(Book book);

    void borrowBook();
}
