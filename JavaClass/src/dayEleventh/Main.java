package dayEleventh;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter("data.txt");
//            fw.write("hello");
//        // 여러개의 exception 처리
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//         try 다음 괄호 안에서 생성한 파일 객체는 finally 블록에서 close() 생략 가능
//        try (FileWriter fw = new FileWriter("data.txt")){
//            fw.write("Hello");
//        } catch (IOException e) {
//            System.out.println("에러 발생");
//        }
//        
//        FileWriter fw = new FileWriter("data.txt");
//        fw.write("Hello World");
//        fw.flush();
//        fw.close();
//        
//        FileReader fr = new FileReader("data.txt");
//        int i = fr.read();
//        while (i != -1) {
//            char ch = (char) i;
//            System.out.print(ch);
//            i = fr.read();
//        }
//        fr.close();
//        FileOutputStream fos = new FileOutputStream("save.txt");
//        fos.write(65);
//        fos.flush();
//        fos.close();
        
        
        
    }
    
    public static String fileRead(String fileName) throws IOException {
        String result = "";
        FileReader fr = new FileReader("data.txt");
        int ch = fr.read();
        while (ch != -1) {
            result += (char) ch;
            ch = fr.read();
        }
        fr.close();
        return result;
    }
    
    public static void something() throws InterruptedException{
        System.out.println("시작");
        Thread.sleep(1000);
        System.out.println("끝");        
    }

}
