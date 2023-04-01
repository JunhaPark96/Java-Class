package library.refactor.data;

import java.io.*;
import java.util.*;
import library.refactor.domain.model.*;

public class UserDBData implements DataDAO<User> {
    private String filePath = "C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass\\userInfo.csv";
    
    @Override
    public void save(List<User> users) {
        // try (FileWriter fileWriter = new
        // FileWriter("C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass\\user.csv")){
        // for (User user : users) {
        // fileWriter.append(String.valueOf(user.getId()));
        // fileWriter.append(",");
        // fileWriter.append(user.getName());
        // fileWriter.append(",");
        // fileWriter.append(user.getAddress());
        // fileWriter.append(",");
        // fileWriter.append(user.getNumber());
        // fileWriter.append(",");
        // fileWriter.append(String.valueOf(user.getBirthDate()));
        // fileWriter.append(",");
        // fileWriter.append(String.valueOf(user.getJoinDate()));
        // fileWriter.append("\n");
        // }
        // fileWriter.flush();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
            for (User user : users) {
                bw.write(user.getId() + "," + user.getName() + "," + user.getAge() + "," + user.getAddress() + "," + user.getNumber() + "," + user.getBirthDate() + "," + user.getJoinDate());
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<User> load() {
        return null;
    }

    @Override
    public void backup() {
        // TODO Auto-generated method stub

    }

}
