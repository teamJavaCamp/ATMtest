package com.bank.controller;

import com.bank.model.Loan;
import com.bank.model.MemberDTO;
import com.bank.model.Product;
import com.bank.model.Savings;

import java.util.Scanner;

public class ProductManager {

    private Scanner sc = new Scanner(System.in);

    public ProductManager() {

    }

    public void subSavings(MemberDTO member){

        int deposit;            //월납입금
        double interestRate;     //금리
        int period;             //개월수


        //적금 옵션선택
        while(true){
            System.out.println("===== 적금 가입 메뉴 =====");

            System.out.print("월 납입 할 금액을 입력하세요 (한도 : 50만원) : ");
            deposit = sc.nextInt();

            // 납입 금액
            deposit = sc.nextInt();
            if (deposit > 50) {
                System.out.println();
                System.out.println("납입 한도를 초과했습니다. 다시 입력해주세요.");
                System.out.println();
            }else {
                break;
            }
        }


        while(true){
            System.out.println("===== 적금 가입 메뉴 ======");
            System.out.println(" 납부할 개월 수를 선택하여 주세요 ");
            System.out.println("1) 12개월 (금리 4%)");
            System.out.println("2) 24개월 (금리 4.5%)");
            System.out.println("3) 36개월 (금리 5%)");
            System.out.println("0) 메인메뉴로 ");

            int select = sc.nextInt();

            switch(select){
                case 1:
                    interestRate = 4.0;
                    period = 12;
                    break;
                case 2:
                    interestRate = 4.5;
                    period = 24;
                    break;
                case 3 :
                    interestRate = 5;
                    period = 48;
                    break;
                case 0 :
                    return;
                default:
                    break;
            }


        }

        //선택한걸 바탕으로 Savings 객체 생성

        //생성한 객체를 Member에 있는 productList에 저장


    }

    public void takeLoan(MemberDTO member){

        int takeLoan;       //대출받을 금액
        int period;         //상환기간 개월
        double loanRate;     //이자율
        Product product;

        if(member.getAge() < 19){
            System.out.println("미성년자는 대출 받기가 어렵습니다. ");
            return;
        }

        while(true){

            int a;

            if(member.getAge() < 29){
                a = 1000;
            }else if(member.getAge() < 39){
                a = 3000;
            }else if(member.getAge() < 49){
                a = 5000;
            }else {
                a = 3000;
            }

            System.out.println(" ====== 대출 메뉴 ======");
            System.out.println(" ** 최대 대출 가능 금액은 " + a + "만원 입니다. ** ");
            System.out.println(" 대출받을 금액을 입력하세요  : ");

            takeLoan = sc.nextInt();

            if(takeLoan >= a){
                takeLoan = a;
                break;
            }
        }

        while(true){
            System.out.println("===== 대출메뉴 =====");
            System.out.println(" 대출 상환 기간 선택 ");
            System.out.println(" 1) 12개월 (이자율 4.0%) ");
            System.out.println(" 2) 24개월 (이자율 4.18%) ");
            System.out.println(" 3) 36개월 (이자율 4.36%) ");
            System.out.println(" 4) 48개월 (이자율 4.5%) ");
            System.out.println(" 0) 메인메뉴로 ");

            int select = sc.nextInt();

            switch (select){
                case 1:
                    period = 12;
                    loanRate = 4.0;
                    product = new Loan(2,period,loanRate,takeLoan);
                    member.addProduct(product);
                    return;
                case 2:
                    period = 24;
                    loanRate = 4.18;
                    product = new Loan(2,period,loanRate,takeLoan);
                    member.addProduct(product);
                    return;
                case 3:
                    period = 36;
                    loanRate = 4.36;
                    product = new Loan(2,period,loanRate,takeLoan);
                    member.addProduct(product);
                    return;
                case 4:
                    period = 48;
                    loanRate = 4.5;
                    product = new Loan(2,period,loanRate,takeLoan);
                    member.addProduct(product);
                    return;
                case 0:
                    return;
                default:
                    System.out.println();
                    System.out.println(" ** 잘못된 입력입니다. ** ");
                    System.out.println();
            }
        }
    }
}
