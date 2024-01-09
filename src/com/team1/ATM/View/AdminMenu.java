package com.team1.ATM.View;

import com.team1.ATM.Data.AccountData;
import com.team1.ATM.Data.ProductData;

import java.util.Scanner;

public class AdminMenu {

    Scanner sc = new Scanner(System.in);
    ProductData pd = new ProductData();
    AccountData ad = new AccountData();
    LogInMenu logIn = new LogInMenu();

    public void adminMenu() {
        while (true) {
            int menu;

            System.out.println("*** 관리자 모드 ***");
            System.out.println("1. 상품 수정");
            System.out.println("2. 상품 추가");
            System.out.println("3. 상품 삭제");
            System.out.println("4. 전체 회원 목록 조회");
            System.out.println("5. 전 메뉴로 돌아가기");           // 모든 정보 출력
            System.out.println("9. 종료하기");
            System.out.print("메뉴를 선택해주세요 : ");
            menu = sc.nextInt();
//        System.out.println("5. 각 회원 상품 계좌 조회");         // 잔액, 상품,

            switch (menu) {
                case 1 : pd.changeProduct(); break;
                case 2 : pd.addProduct(); break;
                case 3 : pd.deleteProduct(); break;
                case 4 : ad.search(); break;
                case 5 : logIn.mainMenu(); break;
                case 9 : System.out.println("종료합니다"); return;
                default: System.out.println("잘못 입력을 했습니다. 다시 입력해주세요");
            }
        }
    }
}
