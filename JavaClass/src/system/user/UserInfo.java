package system.user;

import java.util.*;
import system.book.*;

public class UserInfo {
    // 가입한날짜, 이름, 주소, 연락처, 생일(나이), 대출목록
    private Calendar signUpDate;
    private String name;
    private String address;
    private Calendar age;
    private BookInfo borrowing;
    public UserInfo(Calendar signUpDate, String name, String address, Calendar age,
            BookInfo borrowing) {
        this.signUpDate = signUpDate;
        this.name = name;
        this.address = address;
        this.age = age;
        this.borrowing = borrowing;
    }
    public Calendar getSignUpDate() {
        return signUpDate;
    }
    public void setSignUpDate(Calendar signUpDate) {
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
    public Calendar getAge() {
        return age;
    }
    public void setAge(Calendar age) {
        this.age = age;
    }
    public BookInfo getBorrowing() {
        return borrowing;
    }
    public void setBorrowing(BookInfo borrowing) {
        this.borrowing = borrowing;
    }
    
    
}
