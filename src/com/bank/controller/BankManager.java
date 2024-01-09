package com.bank.controller;

import com.bank.data.UserData;
import com.bank.model.AccountDTO;

import java.util.Scanner;

public class BankManager {

    private Scanner sc = new Scanner(System.in);

    private MemberManager mm = new MemberManager();

    private UserData userData = new UserData();

    public BankManager(){}              //기본생성자

    public void showAcc(AccountDTO acc){                //계좌 조회
        System.out.println("계좌번호" + acc.getAccNum());
        System.out.println("잔고" + acc.getBalance());
    }

    public void deposit(AccountDTO acc){                //입금

        System.out.print("입금할 금액 : ");
        long deposit = sc.nextInt();

        if(deposit <= 0){
            System.out.println("잘못된 금액입니다.");
            return;
        }

        acc.setBalance(acc.getBalance() + deposit);

        System.out.println("입금 완료");

    }

    public void withdraw(AccountDTO acc){                //출금

        System.out.print("출금할 금액 : ");
        long withdraw = sc.nextInt();

        if(withdraw <= 0){
            System.out.println("잘못된 금액입니다.");
            return;
        }

        if(acc.getBalance() < withdraw){
            System.out.println("출금할 금액이 잔고보다 큽니다. ");
        }else{
            acc.setBalance(acc.getBalance() - withdraw);
            System.out.println("출금 완료");
        }

    }

    public void transfer(AccountDTO acc){             //이체

        System.out.print("어떤 계좌로 돈을 보낼까요? ");
        int accNum = sc.nextInt();

        if(acc.getAccNum() != (accNum)){          //내 계좌로는 보낼 수 없다.
            System.out.println("출금");
        }
        System.out.println("이 계좌로 보낼 수 없습니다.");
    }




}
