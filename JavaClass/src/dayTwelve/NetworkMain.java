package dayTwelve;

import java.io.*;
import java.net.*;
import java.util.zip.*;

public class NetworkMain {

    public static void main(String[] args) {
        // try {
        // URL url = new URL("https://www.google.com/");
        // InputStream is = url.openStream();
        // InputStreamReader isr = new InputStreamReader(is);
        // int i = isr.read();
        // while (i != -1) {
        // System.out.print((char) i);
        // i = isr.read();
        // }
        // isr.close();
        // } catch (MalformedURLException e) {
        // e.printStackTrace();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        File fos = new File("C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass\\icon.ico");
        try {
            URL url = new URL("https://alimipro.com/favicon.ico");
            InputStream is = url.openStream(); // url객체를 입력 stream에 연결
            BufferedInputStream bis = new BufferedInputStream(is); // InputStream에 들어온 내용을 byte로 읽어들이기
            OutputStream os = new FileOutputStream(fos); // file 결과값을 낼 위치(fos)를 outputstream에 연결
            BufferedOutputStream bout = new BufferedOutputStream(os); // outputstream에 들어온 내용을 byte로 
            
            byte[] buffer = new byte[1000000];
            int data;
            while ((data = bis.read(buffer)) > 0) {
                bout.write(buffer, 0, data);
            }
            
            bout.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
