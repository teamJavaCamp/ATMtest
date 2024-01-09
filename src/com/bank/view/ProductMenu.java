package com.bank.view;

import java.util.Scanner;

public class ProductMenu {

    private Scanner sc = new Scanner(System.in);

    public void productMain(){
        while(true){
            System.out.println("상품메뉴");
            System.out.println(" 1. 내 가입 상품");
            System.out.println(" 2. 적금");
            System.out.println(" 3. 대출");
            System.out.println(" 0. 뒤로 ");
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 0 :
                    return;
            }
        }

    }
}
