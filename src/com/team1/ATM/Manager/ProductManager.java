package com.team1.ATM.Manager;

import com.team1.ATM.DTO.UserDTO;
import com.team1.ATM.View.MainMenu;

import java.util.Scanner;

public class ProductManager {
    UserDTO user = new UserDTO();
    Scanner sc = new Scanner(System.in);
    MainMenu mainMenu = new MainMenu();


    public void savings() {
        int deposit = depositFromSavings();
        int years;
        double interestRate = yearsAndInterestRateFromSavings();

        if (interestRate == 4.0) {
            years = 1;
        } else if (interestRate == 4.5) {
            years = 2;
        } else {
            years = 4;
        }
    }
    
    public int depositFromSavings() { // 한도 적금
        while (true) {
            System.out.println("*** 적금 가입 메뉴  ***");
            System.out.print("월 납입 할 금액을 입력하세요 (한도 : 50만원) : ");
            int deposit1 = sc.nextInt();          // 납입 금액
            sc.nextLine();
            if (deposit1 > 50) {
                System.out.println();
                System.out.println("납입 한도를 초과했습니다. 다시 입력해주세요.");
                System.out.println();
                return deposit1;
            }
        }
    }
    public double yearsAndInterestRateFromSavings() { // 가입한 기간, 금리
        while (true) {
            System.out.print("*** 상품의 기간을 선택해주세요 ***");
            System.out.println("1) 1년 (금리 4%)");
            System.out.println("2) 2년 (금리 4.5%)");
            System.out.println("3) 4년 (금리 5%)");
            System.out.println("9) 상품 메뉴로 돌아가기");
            int yearsToDeposit = sc.nextInt();  // 납입할 개월수

            double interestRate;
            switch (yearsToDeposit) {
                case 1:
                    interestRate = 4.0;
                    return interestRate;
                case 2:
                    interestRate = 4.5;
                    return interestRate;
                case 3:
                    interestRate = 5.0;
                    return interestRate;
                default:
                    System.out.println("잘못 입력을했습니다. 다시 선택해주세요");
                    break;
            }
        }
    }
        public void loan () {
            if (user.getAge() < 20) {
                System.out.println("나이가 어려서 대출 받기 어려웁니다. 몇 년 뒤에 다시 찾아와주세요");
                return;
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

            // 한도 = loanLimit
            // 대출금액 = amount
    }
}