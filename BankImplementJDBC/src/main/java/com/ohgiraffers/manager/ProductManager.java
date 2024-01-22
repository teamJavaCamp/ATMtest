package com.ohgiraffers.manager;

import com.ohgiraffers.controller.Loan;
import com.ohgiraffers.controller.Savings;
import com.ohgiraffers.model.LoanDTO;
import com.ohgiraffers.model.MemberDTO;
import com.ohgiraffers.model.ProductDTO;
import com.ohgiraffers.model.SavingsDTO;

import java.util.Scanner;

public class ProductManager {
    Scanner sc = new Scanner(System.in);
    Loan loan = new Loan();
    Savings savings = new Savings();

    public ProductManager() {
    }



    public void subSavings(MemberDTO member){

        int deposit = savingDeposit();           //월납입금

        if((deposit * 10000) > member.getBalance()){ // 잔고보다 크면
            System.out.println();
            System.out.println(" ** 잔고가 부족합니다. ** ");
            System.out.println();
            return;
        }

        double interestRate = savingRate();   //금리
        int period = 0;             //개월수

        System.out.println("========= 가입한 상품 =========");
        System.out.println("월 납입금 : " + deposit + "만원");
        System.out.println("금리 : " + interestRate + "%") ;
        System.out.println("가입기간 : " + period + "개월");
        System.out.println("==============================");

        System.out.println("선택한 상품이 맞습니까 ?");
        System.out.print("1) 네    2) 아니요    : ");
        int num = sc.nextInt();
        switch(num){
            case 1 :
                ProductDTO savings = new SavingsDTO(1,period, interestRate, deposit);
                member.getBalance().add(savings);
                member.setBalance(member.getBalance() - (deposit * 10000));
                System.out.println("가입이 완료되었습니다.");

                break;
            case 2 :
                System.out.println("취소합니다.");
                break;
            default :
                break;
        }
    }

    // controller로 이동
    public double savingRate(){
        while (true) {
            Loan loan = new Loan();
            System.out.println("***** 상품의 기간 선택 *****");
            System.out.println("1) 12개월 (금리 4%)");
            System.out.println("2) 24개월 (금리 4.5%)");
            System.out.println("3) 48개월 (금리 5%)");
            System.out.print("상품 기간을 선택해 주세요 : ");
            int yearsToDeposit = sc.nextInt();

            double interestRate;
            switch (yearsToDeposit) {
                case 1: savings.SavingsinterestRateAndPeriod(new SavingsDTO(1,12,4)); break;
                case 2: savings.SavingsinterestRateAndPeriod(new SavingsDTO(1,24,4.5)); break;
                case 3: savings.SavingsinterestRateAndPeriod(new SavingsDTO(1,48,5)); break;
                default: System.out.println("잘못 입력을했습니다. 다시 선택해주세요");break;
            }
        }

    }

}
