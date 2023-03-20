package dayEleventh;

import java.io.*;
import java.util.*;

public class FileFormatMain {

    public static void main(String[] args) {
        // FileReader fr;
        // try {
        // fr = new FileReader("gradle.properties");
        // Properties prop = new Properties();
        // prop.load(fr);
        // String string = prop.getProperty("android.useAndroidX");
        // System.out.println(string);
        // fr.close();
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        Employee employee = new Employee("홍길동", 41);
        Department department = new Department("총무부", employee);
        System.out.println(department.getName() + " " + department.getLeader().getName() + " " + department.getLeader().getAge());
        try {
            FileOutputStream fos = new FileOutputStream("company.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(department);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
//        try {
//            FileInputStream fis = new FileInputStream("company.dat");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//            Department department = (Department) ois.readObject();
//            ois.close();
//            
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
    }

}


class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
    String name;
    int age;
    
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}


class Department implements Serializable{
    private static final long serialVersionUID = 2L;
    private String name;
    private Employee leader;
    
    public Department(String name, Employee leader) {
        this.name = name;
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getLeader() {
        return leader;
    }

    public void setLeader(Employee leader) {
        this.leader = leader;
    }
    
}
