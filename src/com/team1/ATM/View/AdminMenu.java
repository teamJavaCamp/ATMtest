package com.team1.ATM.View;

import com.team1.ATM.Data.ProductData;
import com.team1.ATM.Manager.BankManager;
import com.team1.ATM.Manager.ProductManager;

import java.util.Scanner;

public class AdminMenu {

    Scanner sc = new Scanner(System.in);
    ProductManager pm = new ProductManager();
    LogInMenu logIn = new LogInMenu();
    BankManager bankManager = new BankManager();
    EditInfoMenu editInfo = new EditInfoMenu();

    public void adminMenu() {
        while (true) {
            int menu;

            System.out.println("*** 관리자 모드 ***");
            System.out.println("1. 전체 회원 목록 조회");
            System.out.println("2. 회원 정보변경");
            System.out.println("3. 전 메뉴로 돌아가기");           // 모든 정보 출력
            System.out.print("메뉴를 선택해주세요 : ");
            menu = sc.nextInt();

            switch (menu) {
                case 1 : bankManager.showAccount(); break;
                case 2 : editInfo.userInfo(); break;
                case 3 : logIn.mainMenu(); break;
                default: System.out.println("잘못 입력을 했습니다. 다시 입력해주세요");
            }
        }
    }
}
