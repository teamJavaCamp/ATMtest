package com.team1.ATM.View;

import com.team1.ATM.Data.UserData;
import com.team1.ATM.Manager.BankManager;
import com.team1.ATM.DTO.UserDTO;

import java.util.Scanner;

public class LogInMenu {
    Scanner sc = new Scanner(System.in);
    UserDTO user = new UserDTO();
    RegisterMenu registerPage = new RegisterMenu();
    UserData userData = new UserData();
    MainMenu main = new MainMenu();
    AdminMenu adminMenu = new AdminMenu();
    public void mainMenu() {

        while (true) {
            int menu;

            System.out.println("*** 온라인 뱅킹 어플 ***");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 관리자 모드");
            System.out.println("9. 종료하기");
            System.out.print(" 메뉴를 입력해주세요 : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1: registerPage.register(user); break;     // register menu로 이동
                case 2: logIn(); break;                     // register한 정보로 로그인
                case 3: adminMenu.adminMenu(); break;   // 관리자로 로그인
                case 9: System.out.println("종료합니다"); return;
                default: System.out.println("잘못 입력을 했습니다. 다시 입력 해주세요.");
            }
        }
    }
    public void logIn () {

        System.out.print("아이디: ");
        String username = sc.next();
        sc.nextLine();
        System.out.print("비밀번호 : ");
        String password = sc.next();


        // 문제..!
        if (username.trim().equalsIgnoreCase(userData.userName();) && password.trim().equals(user.getPass())) {
            System.out.println("로그인 성공!");
            main.mainSite(); // 로그인이 성공하면 main Menu로 접속
        } else if (username.equals(user.getName())) { // username은 맞았지만 password는 틀리면
            System.out.println("비밀번호가 틀렸습니다"); // password 틀렸다고 출력
        } else if (password.equals(user.getPass())) { // password은 맞았지만 username으 틀리면
            System.out.println("ID를 찾을 수 없습니다"); // username 틀렸다고 출력
        } else {
            System.out.println("아이디랑 비밀번호가 틀렸습니다. 다시 입력해주세요."); return; // 다 틀렸으면, 다 틀렸다고 출력
        }
    }
}

// 비밀번호가 왜 틀리지?
