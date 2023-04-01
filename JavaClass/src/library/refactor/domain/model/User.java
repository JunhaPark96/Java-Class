package library.refactor.domain.model;

import java.time.*;
import java.util.concurrent.atomic.*;

public class User {
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);
    private int id;
    private int age;
    private String name;
    private String address;
    private String number;
    private LocalDate birthDate;
    private LocalDate joinDate;
    
    
    public User(String name,  int age, String address, String number,
            LocalDate birthDate, LocalDate joinDate) {
        this.id = ID_GENERATOR.getAndIncrement();
        this.name = name;
        this.age = age;
        this.address = address;
        this.number = number;
        this.birthDate = birthDate;
        this.joinDate = joinDate;
    }
    
    public User(String name) {
        this.id = ID_GENERATOR.getAndIncrement();;
        this.name = name;
        this.age = age;
        this.address = address;
        this.number = number;
        this.birthDate = birthDate;
        this.joinDate = joinDate;
    }
    
    public int getId() {
        return id;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    public LocalDate getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(LocalDate joinDate) {
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
        return "유저 id: " + id + ", 이름: " + name + ", 나이: " + age
                + ", 주소: " + address + ", 전화번호: " + number + ", 생일: " + birthDate
                + ", 가입날짜: " + joinDate;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    
    
}
