package com.team1.ATM.DTO;

public class ProductDTO { // 그냥 주워짐 ...

    private String productName;
    private long productPrice;
    private int productTime; // time in months

    // 순환이 중요함... 정보/값/기간을 넣으면 돌려줄 수 있는지 debugging 확인을 해야할 것!


    public ProductDTO(String productName, long productPrice, int productTime) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productTime = productTime;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public long getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(long productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductTime() {
        return productTime;
    }

    public void setProductTime(int productTime) {
        this.productTime = productTime;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productTime=" + productTime +
                '}';
    }
}
