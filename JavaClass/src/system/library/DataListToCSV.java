//package system.library;
//
//import java.io.*;
//import java.util.*;
//
//public class DataListToCSV {
//    private User users;
//    private String fileName = "";
//    private String filePath = "C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass";
//    
//    
//    public DataListToCSV(String fileName) {
//        this.users = users;
//        this.fileName = fileName;
//        this.filePath += this.filePath;
//    }
//
//    public void csvWriter(Object obj) {
//        ObjectOutputStream oos = null;
//        
//        ArrayList<User> userList = new ArrayList<>();
//        try {
//            oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("userInfo.txt")));
//            for (User user : userList) {
//                oos.write(user.toCSV().getBytes());
//                oos.write("\n".getBytes());
//            }
//            System.out.println("파일을 저장했습니다");
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                oos.close();
//            } catch (IOException e) {
//                
//            }
//        }
//    }
//    
//    public void csvReader(Object obj) {
//        ArrayList<User> userList = new ArrayList<>();
//        FileReader fr = null;
//        BufferedReader br = null;
//        try {
//            fr = new FileReader("userInfo.txt");
//            br = new BufferedReader(fr);
//            String data = null;
//            
//            do {
//                data = br.readLine();
//                if (data != null) {
//                    String[] userInfo = data.split(",");
//                    User user = new User();                    
//                    user.setSignUpDate(userInfo[0]);
//                    user.setName(userInfo[1]);
//                    user.setAddress(userInfo[2]);
//                    user.setAge(Integer.parseInt(userInfo[3]));
//                    user.setPhoneNum(userInfo[4]);
//                    userList.add(user);
//                }
//            } while (data != null);
//            
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//            try {
//                fr.close();
//            } catch (Exception e) {
//                
//            }
//            try {
//                br.close();
//            } catch (Exception e2) {
//            }
//        }
//        
//        
//    }
//    
//    public void csvWriter(Object obj) {
//        ArrayList<User> userList = new ArrayList<>();
//        userList.add((User)obj);
//        System.out.println(userList.toString());
//        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath, true), "UTF-8"))){
//            for (User user : userList) {
//                bw.write(user.toCSV());
//                bw.newLine();
//            }
//            System.out.println("파일을 저장했습니다");
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } 
//    }
//    public static List<User> csvReader(String filename) {
//        ArrayList<User> userList = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))){
//            String line;
//            while ((line = br.readLine()) != null) {
//                String[] values = line.split(",");
//                String signUpDate = values[0];
//                String name = values[1];
//                String address = values[2];
//                int age = Integer.parseInt(values[3]);
//                String phoneNum = values[4];
//                User user = new User(signUpDate, name, address, age, phoneNum);
//                userList.add(user);
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } 
//        return userList;
//    
//    
//    
//    
//}
