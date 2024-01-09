package com.bank.model;

public class AccountDTO {

    private int accNum;      //계좌번호

    private long balance;        //잔고

    public AccountDTO() {
    }

    public AccountDTO(int accNum, long balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "accNum=" + accNum +
                ", balance=" + balance +
                '}';
    }
}
