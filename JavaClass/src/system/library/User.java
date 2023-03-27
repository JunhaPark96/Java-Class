package system.library;

import java.io.*;
import java.text.*;
import java.util.*;

public class User {
    // 가입한날짜, 이름, 주소, 연락처, 생일(나이), 대출목록
    private int id = 1;
    private String signUpDate;
    private String name;
    private String address;
    private String phoneNum;
    private int age;
    private String fileName = "";
    private String filePath = "C:\\Users\\JUNHA\\eclipse-workspace\\JavaClass\\userInfo.txt";
    
        
    
    @Override
    public String toString() {
        return "회원 id: " + id + ", 등록한 날짜: " + signUpDate + ", 이름: " + name + ", 주소: "
                + address + ", 전화번호: " + phoneNum + ", 나이: " + age;
    }
    
    public User(String signUpDate, String name, String address, int age, String phoneNum) {
        this.signUpDate = signUpDate;
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNum = phoneNum;
    }
    
    public User() {
    }
    public String getSignUpDate() {
        return signUpDate;
    }
    public String getPhoneNum() {
        return phoneNum;
    }
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String toCSV() {
         return signUpDate + "," + name + "," + address + "," + age + "," + phoneNum;
    }
}
