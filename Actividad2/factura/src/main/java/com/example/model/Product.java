package com.example.model;

import java.math.BigDecimal;

public class Product {

    String nameClient;
    String nameProduct;
    BigDecimal amount;
    int quantity;

    public Product ( String nameClient, String nameProduct, BigDecimal amount, int quantity ) {
        this.nameClient = nameClient;
        this.nameProduct = nameProduct;
        this.amount = amount;
        this.quantity = quantity;
    }

    public String getNameClient () { return nameClient; }
    public String getNameProduct () { return nameProduct; }
    public BigDecimal getAmount () { return amount;}
    public int getQuantity () { return quantity; }
    public BigDecimal calculateProductTotal() { return this.amount.multiply(BigDecimal.valueOf(this.quantity)); }
}