package com.team1.ATM;

import com.team1.ATM.User.UserDTO;

import java.util.Scanner;

public class RegisterPage {
    Scanner sc = new Scanner(System.in);
    UserDTO user = new UserDTO();
    public void register () {
        System.out.print("username: ");
        String username = sc.nextLine();
        user.setName(username);
        System.out.print("age : ");
        int age = sc.nextInt();
        user.setAge(age);
        System.out.print("password : ");
        String pass = sc.nextLine();
        user.setPass(pass);
        System.out.print("phoneNo number : ");
        int phoneNo = sc.nextInt();
        user.setPhoneNo(phoneNo);
        System.out.print("bank account : ");
        int bankAcc = sc.nextInt();
        user.setBankAccNo(bankAcc);
    }
}
