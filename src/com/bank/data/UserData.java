package com.bank.data;

import com.bank.model.MemberDTO;

import java.util.HashMap;
import java.util.Map;


public class UserData {

    private Map<String, MemberDTO> memberMap;
    public  UserData(){
        memberMap = new HashMap<String, MemberDTO>();
    }


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






}
