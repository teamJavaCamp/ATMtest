package com.team1.ATM.View;

import com.team1.ATM.Manager.ProductManager;

import java.util.Scanner;

public class ProductMenu {
    Scanner sc = new Scanner(System.in);
    ProductManager productManager = new ProductManager();
    MainMenu mainMenu = new MainMenu();
    public void ProductInfo() {

        while (true) {
            System.out.println("*** 상품 메뉴 ***");
            System.out.println("상품 종류는 선택하세요");
            System.out.println("1. 적금");     // 적금, 대출 (2가지)
            System.out.println("2. 대출");
            System.out.println("3. 전 페이지로 돌아가기");
            System.out.print("메뉴를 선택해주세요 : ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1 : productManager.savings(); break;      // 상품 종류
                case 2 : productManager.loan(); break;      // 상품 가격
                case 3 : mainMenu.mainSite(); break;    // 메인 메뉴로 돌아가기
                default: System.out.println("잘못 선택을 했습니다. 다시 입력해주세요"); return;
            }
        }
    }
}
