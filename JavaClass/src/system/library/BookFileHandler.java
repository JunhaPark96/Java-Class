package system.library;

import java.io.*;
import java.util.*;

public class BookFileHandler {
    
    public static List<Book> csvReader(String filename) {
        ArrayList<Book> bookList = new ArrayList<>();
        try (BufferedReader br =
                new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] element = line.split(",");
                Book book = new Book();
                book.setPublishDate(element[0]);
                book.setName(element[1]);
                book.setAuthor(element[2]);
                book.setIsbn(element[3]);
                book.isCheckedOut(true);
                bookList.add(book);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return bookList;
    }
    
    public static void csvWriter(List<Book> bookList, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            
            for (Book book : bookList) {
                bw.write(book.getPublishDate() + "," + book.getName() + "," + book.getAuthor() + ","
                        + book.getIsbn());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}
