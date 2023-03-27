//package system.library;
//
//import java.io.*;
//import java.util.*;
//
//public class FileManagement {
//    private String fileName = "";
//    private String filePath = "C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass";
//    private File file;
//
//    // 파일 쓰기
//    public boolean fileWriter(Object obj) {
//        boolean result = false;
//        ObjectOutputStream oos = null;
//
//        try {
//            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
//            oos.writeObject(obj);
//            oos.flush();
//            result = true;
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                oos.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return result;
//
//    }
//
//    public Object fileReader() {
//        List<Object> elementList = new ArrayList<Object>();
//        ObjectInputStream ois = null;
//        try {
//            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
//            while (true) {
//                try {
//                    User user = (User) ois.readObject();
//                    elementList.add(user);
//                } catch (ClassNotFoundException e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (EOFException e) {
//            // 파일 끝에 도달했을 때 예외 발생 -> 처리 필요 없음
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return elementList;
//    }
//
//
//    // elementList = (List<Object>) ois.readObject();
//    // return elementList;
//
//    public String getFileName() {
//        return fileName;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }
//
//    public String getFilePath() {
//        return filePath;
//    }
//
//    public void setFilePath(String filePath) {
//        this.filePath = filePath;
//    }
//
//    public File getFile() {
//        return file;
//    }
//
//    public void setFile(File file) {
//        this.file = file;
//    }
//
//
//    public FileManagement(String fileName) {
//        this.fileName = fileName;
//        this.filePath += "\\" + this.fileName;
//        this.file = new File(filePath);
//    }
//
//
//}
