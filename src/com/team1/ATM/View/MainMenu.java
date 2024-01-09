package com.team1.ATM.View;

import com.team1.ATM.DTO.UserDTO;
import com.team1.ATM.Data.AccountData;
import com.team1.ATM.Data.ProductData;

import java.util.Scanner;

public class MainMenu extends UserDTO{
    UserDTO user = new UserDTO();
    Scanner sc = new Scanner(System.in);
    ProductMenu pm = new ProductMenu();
    ProductData pd = new ProductData();
    AccountData data = new AccountData();
    public void mainSite() {

        while (true) {

        System.out.println("*** 온라인 뱅킹 시스템 ***");    // AccountData
        System.out.println("1. 계좌 조회");               // getBalance
        System.out.println("2. 입금");                   // deposit
        System.out.println("3. 출금");                   // withdraw
        System.out.println("4. 계좌 이체");               // account transfer
//        System.out.println("5. 통장 정리");             // 미...
//        System.out.println("6. 개인정보 변경");
//        System.out.println("7. 예약");                 // 미정
        System.out.println("5. 상품 페이지");             // 대출, 적금
        System.out.println("9. 로그아웃");               // log out... return
        System.out.print("입력할 메뉴를 선택 해주세요 : ");
        int menu = sc.nextInt();

            switch (menu) {
                case 1 : data.getBalance();            // 계좌 조회
                case 2 : data.deposit();           // 입금
                case 3 : data.withdraw();         // 출금
                case 4 : data.transferMoney();      // 이체
                case 5 : pm.ProductInfo(); break;   // 상품 조회
                case 9 : System.out.println("로그아웃합니다"); return;
            }
        }
    }
}



