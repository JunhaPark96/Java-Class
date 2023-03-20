package dayEleventh;

import java.io.*;

public class PracticeMain {

    public static void main(String[] args) {
        // String s = null;
        // try {
        // System.out.println(s.length());
        // } catch (NullPointerException e) {
        // System.out.println("NullPointerException 예외를 catch 하였습니다");
        // System.out.println("---- stack trace(여기부터) ----");
        // e.printStackTrace();
        // System.out.println("---- stack trace(여기까지) ----");
        // }
        // String s = "Three";
        // try {
        // int i = Integer.parseInt(s);
        // System.out.println(i);
        // } catch (NumberFormatException e) {
        // System.out.println("문자열을 숫자로 parsing하지 마시오");
        // e.getStackTrace();
        // e.printStackTrace();
        // }

        System.out.println("프로그램 시작");
        FileWriter fw = null;
        try {
            fw = new FileWriter("data.txt");
            fw.write("hello");
        } catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
