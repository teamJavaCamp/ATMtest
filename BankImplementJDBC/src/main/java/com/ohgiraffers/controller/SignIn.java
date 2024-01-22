package com.ohgiraffers.controller;

import com.bank.model.MemberDTO;
import com.ohgiraffers.model.MemberDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import static com.bank.common.JDBCTemplate.close;
import static com.bank.common.JDBCTemplate.getConnection;
import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class SignIn {
    public MemberDTO signIn(String id, String pwd){
        Connection con = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rset = null;

        MemberDTO member = new MemberDTO();

//        boolean result = false;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/bank/mapper/menu-query.xml"));
            String query = prop.getProperty("checkId");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1,id);
            pstmt.setString(2,pwd);

            rset = pstmt.executeQuery();

            if(rset.next()) {
                member.setId(rset.getString("id"));
                member.setPwd(rset.getString("pwd"));
                member.setName(rset.getString("name"));
                member.setAge(rset.getInt("age"));
                member.setGender(rset.getString("gender"));
                member.setAccNo(rset.getString("account"));
                member.setBalance(rset.getLong("balance"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            close(rset);
            close(pstmt);
            close(con);
        }
        return member;
    }
}
