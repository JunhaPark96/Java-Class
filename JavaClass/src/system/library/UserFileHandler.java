package system.library;

import java.io.*;
import java.util.*;

public class UserFileHandler {

    public static List<User> csvReader(String filename) {
        ArrayList<User> userList = new ArrayList<>();
        try (BufferedReader br =
                new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] element = line.split(",");
                User user = new User();
                user.setId(Integer.parseInt(element[0]));
                user.setSignUpDate(element[1]);
                user.setName(element[2]);
                user.setAddress(element[3]);
                user.setPhoneNum(element[4]);
                user.setAge(Integer.parseInt(element[5]));
                userList.add(user);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return userList;
    }
    
    public static void csvWriter(List<User> userList, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
//            User user = userList.get(userList.size() - 1);
            
            for (User user : userList) {
                bw.write(user.getId() + "," + user.getSignUpDate() + "," + user.getName() + ","
                        + user.getAddress() + "," + user.getPhoneNum() + "," + user.getAge());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void csvDeletedWriter(List<User> userList, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
//            User user = userList.get(userList.size() - 1);
            
            for (User user : userList) {
                bw.write(user.getId() + "," + user.getSignUpDate() + "," + user.getName() + ","
                        + user.getAddress() + "," + user.getPhoneNum() + "," + user.getAge());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
