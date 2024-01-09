package com.bank.model;

public class Product {

    private String productName;     //상품명
    private int Type;               //상품타입 (1.적금 / 2.대출)
    private int period;             //가입기간, 대출기한

    public Product() {
    }

    public Product(String productName, int type, int period) {
        this.productName = productName;
        Type = type;
        this.period = period;
    }

    public Product(String productName, int period) {
        this.productName = productName;
        this.period = period;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", Type=" + Type +
                ", period=" + period +
                '}';
    }
}
