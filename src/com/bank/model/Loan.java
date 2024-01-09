package com.bank.model;

public class Loan extends Product {

    private float loanRate;     //이자율
    private int loanLimit;        //최대 대출 가능 금액

    public Loan() {
    }

    public Loan(String productName, int period, float loanRate, int loanLimit) {
        super(productName, period);
        this.loanRate = loanRate;
        this.loanLimit = loanLimit;
    }

    public float getLoanRate() {
        return loanRate;
    }

    public void setLoanRate(float loanRate) {
        this.loanRate = loanRate;
    }

    public int getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(int loanLimit) {
        this.loanLimit = loanLimit;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanRate=" + loanRate +
                ", loanLimit=" + loanLimit +
                '}';
    }
}
