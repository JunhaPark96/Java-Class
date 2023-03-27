package library.refactor.domain.model;

import java.util.*;

public class User {
    private int id;
    private int gender;
    private int age;
    private String name;
    private String address;
    private String number;
    private Date birthDate;
    private Date joinDate;
    public User(int id, String name, int gender, int age, String address, String number,
            Date birthDate, Date joinDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
        this.number = number;
        this.birthDate = birthDate;
        this.joinDate = joinDate;
    }
    public int getId() {
        return id;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
    public Date getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGender() {
        return gender;
    }
    public void setGender(int gender) {
        this.gender = gender;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getNumber() {
        return number;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", gender=" + gender + ", age=" + age + ", name=" + name
                + ", address=" + address + ", number=" + number + ", birthDate=" + birthDate
                + ", joinDate=" + joinDate + "]";
    }
    public void setNumber(String number) {
        this.number = number;
    }
    
    
}
