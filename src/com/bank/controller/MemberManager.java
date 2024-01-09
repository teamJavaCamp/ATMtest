package com.bank.controller;

import com.bank.data.UserData;
import com.bank.model.AccountDTO;
import com.bank.model.MemberDTO;

import java.util.Scanner;

public class MemberManager {

    private Scanner sc = new Scanner(System.in);
    private UserData userData = new UserData();     //회원 데이터
    public MemberManager(){}

    public void signUp(){
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("나이");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("성별");
        char gender = sc.nextLine().charAt(0);

        System.out.print("id : ");
        String id = sc.nextLine();

        if(!userData.getMemberMap().containsKey(id)){

            System.out.print("pwd : ");
            String pwd = sc.nextLine();

            MemberDTO member = new MemberDTO(name, age, gender, id, pwd);

            userData.addMember(id, member);
            creatAccount(id, member);
            System.out.println("회원가입이 완료되었습니다. ");

        }
//        userData.addMember(new MemberDTO(name, age, gender, id, pwd)); //회원 객체 생성후 리스트에 저장

    }

    public String signIn(){               //로그인

        System.out.print("id : ");
        String id = sc.nextLine();
        if(userData.getMemberMap().containsKey(id)){
            System.out.print("pwd : ");
            String pwd = sc.nextLine();
            MemberDTO member = userData.getMember(id);

            if(member.getPwd().equals(pwd)){
                return id;

            }else {
                System.out.println("비밀번호가 틀립니다.");
            }

        }else {
            System.out.println("등록된 아이디가 없습니다.");
        }
        return "";

    }

    public MemberDTO memberSignin(String id){
        return userData.getMember(id);
    } //회원객체 전달

    public void creatAccount(String id, MemberDTO member){
                //계좌번호 난수 생성
        AccountDTO acc = new AccountDTO(1234, 0);

        member.setAccount(acc);

    }

    public void showMemberAll(){
        System.out.println(userData.getMemberMap());
    }   //회원 전체 조회




}
