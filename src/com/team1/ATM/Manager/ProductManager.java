package com.team1.ATM.Manager;

import com.team1.ATM.DTO.UserDTO;
import com.team1.ATM.View.MainMenu;

import java.util.Scanner;

public class ProductManager {
    UserDTO user = new UserDTO();
    Scanner sc = new Scanner(System.in);
    MainMenu mainMenu = new MainMenu();


    public void productTypes() {

        System.out.println("*** 상품 종류 ***");
        System.out.println("1. 적금");
        System.out.println("2. 대출");
        System.out.println("3. 전 메뉴로 돌아가기");
        System.out.print("메뉴를 입력해주세요 : ");
        int menu = sc.nextInt();

        while (true) {
            switch (menu) {
                case 1 : savings(); break;
                case 2 : loan(); break;
                case 3 : mainMenu.mainSite(); break;
                default: System.out.println("잘못 선택을했습니다. 다시 입력해주세요"); return;
            }
        }
    }
    public void savings() {

        System.out.println("*** 적금 시스템 ***");

        System.out.print("월 납입 할 금액 (한도 : 50만원) : ");
        double deposit1 = sc.nextDouble();          // 납입 금액
        sc.nextLine();
        if (deposit1 > 50) {
            System.out.println("한도를 초과했습니다. 다시 입력해주세요."); return;
        }

        System.out.print("상품의 기간을 선택해주세요");
        System.out.println("1) 1년 : 4%");
        System.out.println("2) 2년 : 4.5%");
        System.out.println("3) 4년 : 5%");
        int monthsToDeposit = sc.nextInt();  // 납입할 개월수

        while (true) {
            double interestRate;
            switch (monthsToDeposit) {
                case 1:
                    interestRate = 4.0;
                    break;
                case 2:
                    interestRate = 4.5;
                    break;
                case 3:
                    interestRate = 5.0;
                    break;
                default:
                    System.out.println("잘못 입력을했습니다. 다시 선택해주세요");
                    return;
            }

            // 굳이 ?
//        if (monthsToDeposit <= 12) {
//            double interestRate = 4.0d;
//        } else if (monthsToDeposit <= 24) {
//            double interestRate = 4.5d;
//        } else if (monthsToDeposit <= 48) {
//            double interestRate = 5;
//        } else {
//            double interestRate = 6;
//        }
            int years;
            if (monthsToDeposit == 1) {
                years = 12;
            } else if (monthsToDeposit == 2) {
                years = 2;
            } else {
                years = 4;
            }
            System.out.println("선택하신 상품은 " + monthsToDeposit + "번");
            System.out.println("월 납입 할 금액 : " + deposit1 + "만원\n선택하신 이자 : " + interestRate + "%\n납부할 기간 : " + years + "년");
            System.out.println("맞으면 1번, 아니면 2번 입력해주세요");
            int choice = sc.nextInt();

            while (true) {
                switch (choice) {
                    case 1:
                        continue;
                    case 2:
                        return;
                }

            }
        }
        // balance에서 자동으로 돈이 빠지는 걸로..!
    }
    public void loan() {
        if (user.getAge() < 20) {
            System.out.println("나이가 어려서 대출 받기 어려웁니다. 몇 년 뒤에 다시 찾아와주세요"); return;
            // product type으로 돌아가기
        }
            System.out.println("*** 대출 시스템 ***");
        double loanLimit;

        if (user.getAge() <= 30) {
            loanLimit = 1_000;
        } else if (user.getAge() <= 40) {
            loanLimit = 3_000;
        } else {
            loanLimit = 5_000;
        }   // 나이에 따라 대출 받을 수 있는 금액이 달라진다.

        System.out.println("한도는 " + loanLimit + "만원 입니다");
        System.out.print("대출 받을 금액을 입력 하세요 (만원 단위로): ");
        int amount = sc.nextInt();
        System.out.println("기간을 입력하세요 (개월수) : ");
        int months = sc.nextInt();

        System.out.println("*** 대출 현황 ***");
        System.out.println("대출 할 금액은 " + amount + "만원 입니다");
        System.out.println("기간은 " + months + " 입니다");
    }
}
