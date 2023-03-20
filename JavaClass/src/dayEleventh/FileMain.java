package dayEleventh;

import java.io.*;
import java.util.zip.*;

public class FileMain {

    public static void main(String[] args) throws IOException {
//        File file = new File("C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass\\FilePrac.txt");
//        File copiedFile =
//                new File("C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass\\FilePracCopy.txt");
//        FileReader fis = new FileReader(file);
//        FileOutputStream fos = new FileOutputStream(copiedFile);
//
//        byte[] buffer = new byte[1024];
//        int data;
//
//        while ((data = fis.read(buffer)) > 0) {
//            fos.write(buffer, 0, data);
//
//        }
//
//        fis.close();
//        fos.close();
        
        File file = new File("C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass\\FilePrac.txt");
        File zipFile =
                new File("C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass\\FilePracCopy.txt.zip");
        
        try (
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            GZIPOutputStream gout = new GZIPOutputStream(new FileOutputStream(zipFile));
            BufferedOutputStream bout = new BufferedOutputStream(gout);
        ) {
            byte[] buffer = new byte[1024];
            int data;
            while ((data = bis.read(buffer)) > 0    ) {
                bout.write(buffer, 0, data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
