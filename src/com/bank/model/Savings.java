package com.bank.model;

public class Savings extends Product{

    private float interestRate;     //금리
    private int monthly;            //매달 납입 금액

    public Savings() {
    }

    public Savings(String productName, int period, float interestRate, int monthly) {
        super(productName, period);
        this.interestRate = interestRate;
        this.monthly = monthly;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public int getMonthly() {
        return monthly;
    }

    public void setMonthly(int monthly) {
        this.monthly = monthly;
    }

    @Override
    public String toString() {
        return "Savings{" +
                "interestRate=" + interestRate +
                ", monthly=" + monthly +
                '}';
    }
}
