package com.ohgiraffers.view;

import com.ohgiraffers.controller.Loan;
import com.ohgiraffers.controller.Savings;
import com.ohgiraffers.manager.MemberManager;
import com.ohgiraffers.manager.ProductManager;
import com.ohgiraffers.model.MemberDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

import static com.ohgiraffers.common.JDBCTemplate.getConnection;

public class ProductMenu {
    Scanner sc = new Scanner(System.in);
    MemberManager mm = new MemberManager();


    public void productMain(MemberDTO member){
        while(true){
            System.out.println(" ===== 상품메뉴 =====");
            System.out.println(" 1. 내 가입 상품");
            System.out.println(" 2. 적금");
            System.out.println(" 3. 대출");
            System.out.println(" 0. 뒤로 ");
            System.out.print("메뉴 선택 : ");
            int num = sc.nextInt();

            switch (num) {
                case 1 :
                    mm.showMyProduct(member);
                    break;
                case 2 :
                    ProductManageSavings(); // erd에 product_id에 1번 (적금) 입력
                    break;
                case 3 :
                    ProductManageLoan(); // erd에 product_id에 2번 (대출) 입력
                    break;
                default :
                    System.out.println();
                    System.out.println(" ** 잘못된 입력입니다. **");
                    System.out.println();
                    return;
            }
        }

    }
    public static void ProductManageSavings() {
        Savings savings = new Savings();

        MemberDTO member = new MemberDTO();

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        Properties prop = new Properties();
        ResultSet rset = null;

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
            String query = prop.getProperty("SelectWhichProduct");
            pstmt = con.prepareStatement(query);

            pstmt.setString(1,member.getId()); // id를 넣어야 한다
            pstmt.setInt(2,1); // number 1 : savings

            rset = pstmt.executeQuery();

            if (rset.next()) {
                savings.savingsMainMenu(); // 성공을 하면 savings의 main menu로 이동
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void ProductManageLoan() {Savings savings = new Savings();
        Loan loan = new Loan();

        MemberDTO member = new MemberDTO();

        Connection con = getConnection();
        PreparedStatement pstmt = null;
        Properties prop = new Properties();
        ResultSet rset = null;

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/mapper/menu-query.xml"));
            String query = prop.getProperty("SelectWhichProduct");
            pstmt = con.prepareStatement(query);

            pstmt.setString(1,member.getAccNo()); // id를 넣어야 한다
            pstmt.setInt(2,2); // number 2 : loan

            rset = pstmt.executeQuery();

            if (rset.next()) {
                loan.loanMainMenu(member); // 성공을 하면 loan의 main menu로 이동을 한다..!
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
