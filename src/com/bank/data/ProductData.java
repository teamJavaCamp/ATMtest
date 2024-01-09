package com.bank.data;

import com.bank.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductData {

    private List<Product> productList;
    public ProductData(){
        productList = new ArrayList<Product>();
    }

    public void addProduct(Product product){
        productList.add(product);
    } //상품 추가

    public void deleteProduct(Product product){
        productList.remove(product);
    }  //상품 삭제



}