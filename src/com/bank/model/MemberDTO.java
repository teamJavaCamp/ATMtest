package com.bank.model;

import java.util.List;

public class MemberDTO {

    private String name;        //이름
    private int age;            //나이
    private char gender;        //성별
    private String id;          //아이디
    private String pwd;         //패스워드
    private AccountDTO account; //계좌
    private List<Product> product; //가입된 상품
    private boolean isAdmin;    //관리자면 true 아니면 false

    public MemberDTO(){}        //회원DTO 기본 생성자

    public MemberDTO(String name, int age, char gender, String id, String pwd) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.pwd = pwd;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public AccountDTO getAccount() {
        return account;
    }

    public void setAccount(AccountDTO account) {
        this.account = account;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", account=" + account +
                ", product=" + product +
                '}';
    }
}
