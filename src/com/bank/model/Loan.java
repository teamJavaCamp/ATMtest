package com.bank.model;

public class Loan extends Product {

    private double loanRate;     //이자율
    private int takeLoan;        //최대 대출 가능 금액

    public Loan() {
    }

    public Loan(int type, int period, double loanRate, int takeLoan) {
        super(type, period);
        this.loanRate = loanRate;
        this.takeLoan = takeLoan;
    }

    public double getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(double loanRate) {
        this.loanRate = loanRate;
    }

    public int getTakeLoan() {
        return takeLoan;
    }

    public void setTakeLoan(int takeLoan) {
        this.takeLoan = takeLoan;
    }

    @Override
    public String toString() {
        return "대출\n" +
                "대출금액 : " + takeLoan + "\n" +
                "이자율 : " + loanRate + "% \n" +
                "상환기간 : " + super.getPeriod() + " 개월";
    }
}
