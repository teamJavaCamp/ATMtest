package com.ohgiraffers.controller;

import com.ohgiraffers.model.MemberDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import static com.ohgiraffers.common.JDBCTemplate.close;
import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class RegistMember {

    public int registMember(MemberDTO member){

        Connection con = getConnection();

        PreparedStatement pstmt = null;
        Properties prop = new Properties();

        int result = 0;

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/bank/mapper/menu-query.xml"));
            String query = prop.getProperty("registMember");

            pstmt = con.prepareStatement(query);
            pstmt.setString(1, member.getId());
            pstmt.setString(2, member.getPwd());
            pstmt.setString(3, member.getName());
            pstmt.setInt(4,member.getAge());
            pstmt.setString(5,member.getGender());
            pstmt.setString(6,member.getAccNo());
            pstmt.setLong(7,member.getBalance());

            result = pstmt.executeUpdate();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(pstmt);
            close(con);
        }
        return result;
    }
}
