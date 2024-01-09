package com.team1.ATM.DTO;

public class AccountDTO {
//    UserDTO user = new UserDTO(); 필요없음
    private int bankType;
    private String name;
    private int bankAccNo; // 1 : savings, 2 : checking
    private String bankAccType;
    private long balance;

    public AccountDTO(int bankType, String name, int bankAccNo, String bankAccType, long balance) {
        this.bankType = bankType;
        this.name = name;
        this.bankAccNo = bankAccNo;
        this.bankAccType = bankAccType;
        this.balance = balance;
    }

    public int getBankType() {
        return bankType;
    }

    public void setBankType(int bankType) {
        this.bankType = bankType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(int bankAccNo) {
        this.bankAccNo = bankAccNo;
    }

    public String getBankAccType() {
        return bankAccType;
    }

    public void setBankAccType(String bankAccType) {
        this.bankAccType = bankAccType;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountData{" +
                "bankType=" + bankType +
                ", name='" + name + '\'' +
                ", bankAccNo=" + bankAccNo +
                ", bankAccType='" + bankAccType + '\'' +
                ", balance=" + balance +
                '}';
    }
}

