package com.bank.data;

import com.bank.model.MemberDTO;

import java.util.HashMap;
import java.util.Map;


public class UserData {

    private Map<String, MemberDTO> memberMap = new HashMap<>();
    public MemberDTO getMember(String id){
        return memberMap.get(id);
    }

    public Map<String, MemberDTO> getMemberMap() { // 회원 맵 전달
        return memberMap;
    }

    public void addMember(String username, MemberDTO member) { // 회원 추가
        memberMap.put(username, member);
    }

    public void removeMember(String username) { // 회원 삭제
        memberMap.remove(username);
    }

    public void showMembers() {
        for (MemberDTO member : memberMap.values()) {
            System.out.println(member);
        }
    }
/*
    private ArrayList<MemberDTO> memberList = new ArrayList<>();

    public ArrayList<MemberDTO> getMemberList(){ //회원 리스트 전달
        return memberList;
    }

    public void addMember(MemberDTO member){       //회원 추가
        memberList.add(member);
    }

    public void removeMem(int index){               //회원 삭제
        memberList.remove(index);
    }

    public void showMem(){
        System.out.println(memberList);
    }       //회원 전체 조회*/








}
