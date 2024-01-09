package com.bank.controller;

import com.bank.data.AccountData;
import com.bank.data.UserData;
import com.bank.model.AccountDTO;
import com.bank.model.MemberDTO;

import java.util.Scanner;

public class MemberManager {

    private Scanner sc = new Scanner(System.in);
    private UserData userData = new UserData();     //회원 데이터
    private AccountData accData = new AccountData();
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
            creatAccount(member);
            System.out.println("회원가입이 완료되었습니다. ");

        }

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

    public void creatAccount(MemberDTO member){
        int accNum =0;

        for(int i = 0; i < accData.getList().size() + 1; i++){
            accNum = (int) (Math.random() * 999999);
            for(int j= 0; j < i; j++){
                if(accData.getList().get(i).equals(accNum)){

                    i--;
                    break;
                }
            }
        }
                //계좌번호 난수 생성

        AccountDTO acc = new AccountDTO(accNum, 0);

        accData.addAccount(acc); //리스트에 담기
        member.setAccount(acc); //회원정보에 계좌정보저장

    }

    public void showMemberAll(){
        System.out.println(userData.getMemberMap());
    }   //회원 전체 조회

    public void showMyProduct(MemberDTO member){
        member.getProduct();
    }                                           // 내 가입 상품 조회

    public void editInfo(int select, MemberDTO member){

        while(true){
            switch(select){
                case 1 :
                    System.out.print("변경할 이름 : ");
                    String name = sc.nextLine();
                    member.setName(name);
                    userData.addMember(member.getId(), member); //변경하고 다시 저장

                case 2 :
                    System.out.print("변경할 나이 : ");
                    int age = sc.nextInt();
                    member.setAge(age);
                    userData.addMember(member.getId(), member);


                case 3 :
                    System.out.println("변경할 성별 : ");
                    char gender = sc.nextLine().charAt(0);
                    member.setGender(gender);
                    userData.addMember(member.getId(), member);

                case 4 :
                    System.out.println("변경할 비밀번호 : ");
                    String pwd = sc.nextLine();
                    member.setPwd(pwd);
                    userData.addMember(member.getId(), member);

                case 0 :
                    break;

            }
        }
    }
}
