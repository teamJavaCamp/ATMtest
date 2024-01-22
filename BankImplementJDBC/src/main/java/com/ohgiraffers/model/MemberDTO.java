package com.ohgiraffers.model;

import java.util.ArrayList;
import java.util.List;

public class MemberDTO {

    private String name;        //이름
    private int age;            //나이
    private String gender;        //성별
    private String id;          //아이디
    private String pwd;         //패스워드
    private String accNo;
    private long balance;

    public MemberDTO(){}        //회원DTO 기본 생성자

    public MemberDTO(String name, int age, String gender, String id, String pwd, String accNo, long balance) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.pwd = pwd;
        this.accNo = accNo;
        this.balance = balance;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", accNo='" + accNo + '\'' +
                ", balance=" + balance +
                '}';
    }
}
