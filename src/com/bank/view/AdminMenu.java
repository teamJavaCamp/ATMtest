package com.bank.view;

import com.bank.controller.MemberManager;

import java.util.Scanner;

public class AdminMenu {
    private Scanner sc = new Scanner(System.in);

    private MemberManager mm = new MemberManager();

    public AdminMenu(){}

    public void adminMain(){

        System.out.println("관리자 모드");
        System.out.println("1. 회원 전체 조회");
        System.out.println("2. 상품 추가");
        System.out.println("3. 상품 삭제");
        System.out.println("0. 뒤로");
        System.out.print("메뉴 선택 : ");

        while(true){

            int num = sc.nextInt();
            switch (num){
                case 1 :
                    mm.showMemberAll();
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
