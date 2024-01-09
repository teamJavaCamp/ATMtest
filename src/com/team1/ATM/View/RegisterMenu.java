package com.team1.ATM.View;

import com.team1.ATM.DTO.UserDTO;

import java.util.Scanner;

public class RegisterMenu {
    Scanner sc = new Scanner(System.in);
    UserDTO user = new UserDTO();
    public void register (UserDTO user) {
        System.out.print("username: ");
        String username = sc.nextLine();
        user.setName(username);
        System.out.print("age : ");
        int age = sc.nextInt();
        user.setAge(age);
        System.out.print("password : ");
        String pass = sc.nextLine();
        user.setPass(pass);
        sc.nextLine();
        System.out.print("phone number : ");
        int phoneNo = sc.nextInt();
        user.setPhoneNo(phoneNo);
        System.out.print("bank account : ");
        int bankAcc = sc.nextInt();
        user.setBankAccNo(bankAcc);
    }

    public void bankAccInfo() {
        System.out.println("Create a bank of your choice");
        System.out.println("1. 곡민은행 2. 저리은행 3. 신해은행");
        int no = sc.nextInt();
        System.out.print("Enter Account no : ");
        int accNo = sc.nextInt();
        System.out.print("Enter Account type : ");

        System.out.print("Enter Balance : ");
        System.out.println();
        }
    }
}
