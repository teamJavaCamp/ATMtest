package com.team1.ATM.DTO;

public class UserDTO { // from RegisterMenu

    private String name;    // 이름
    private int age;        // 나이
    private String pass;       // 비밀번호
    private int phoneNo;    // 전화번호
    private int bankAccNo;  // 계좌번호

    public UserDTO() {}
    public UserDTO(String name, int age, String pass, int phoneNo, int bankAccNo) {
        this.name = name;
        this.age = age;
        this.pass = pass;
        this.phoneNo = phoneNo;
        this.bankAccNo = bankAccNo;
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

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(int bankAccNo) {
        this.bankAccNo = bankAccNo;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pass='" + pass + '\'' +
                ", phoneNo=" + phoneNo +
                ", bankAccNo=" + bankAccNo +
                '}';


    }
}
