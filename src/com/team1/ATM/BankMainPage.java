package com.team1.ATM;

import com.team1.ATM.User.UserDTO;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BankMainPage {

    Scanner sc = new Scanner(System.in);
    UserDTO user = new UserDTO();
    RegisterPage registerPage = new RegisterPage();
    ManagerMode managerMode = new ManagerMode();

    public void mainMenu() {

        while (true) {

            int menu;

            System.out.println("*** 온라인 뱅킹 어플 ***");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 관리자 모드");
            System.out.println("9. 종료하기");
            System.out.print("들어갈 메뉴를 입력해주세요 : ");
            menu = sc.nextInt();


            switch (menu) {
                case 1: registerPage.register(); break;
                case 2: logIn(); break;
                case 3: managerMode.managerMode(); break;
                case 9: System.out.println("종료합니다"); return;
                default: System.out.println("잘못 입력을 했습니다. 다시 입력 해주세요."); continue;
            }
        }
    }
        public void logIn () {
            System.out.print("username: ");
            String username = sc.nextLine();
            sc.nextLine();
            System.out.print("password : ");
            String password = sc.nextLine();

            if (username.equals(user.getName()) && password.equals(user.getPass())) {
                System.out.println("*** 온라인 뱅킹 시스템 ***");
                System.out.println("1. 계좌 조회");
                System.out.println("2. 입금");
                System.out.println("3. 출금");
                System.out.println("4. 계좌 이체");
                System.out.println("5. 통장 정리");
                System.out.println("6. 개인정보 변경");
                System.out.println("7. 예약");
                System.out.println("8. 상품 페이지");        // 대출, 적금
                System.out.println("9. 로그아웃");
                System.out.print("입력할 메뉴를 선택 해주세요 : ");
            } else if (username.equals(user.getName())) {
                System.out.println("잘못된 password");
                return;
            } else if (password.equals(user.getPass())) {
                System.out.println("잘못된 user");
                return;
            } else {
                System.out.println("username or password이 틀렸습니다. 다시 입력해주세요.");
                int menu = sc.nextInt();

                while (true) {

                    switch (menu) {
                        case 1:
                    }

                }
            }
        }
}

