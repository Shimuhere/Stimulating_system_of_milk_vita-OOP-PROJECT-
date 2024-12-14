package com.example.project_milkvita.TayyibaUser6;

import java.time.LocalDate;

public class salestransaction {
    private String productname;
    private int quantity,saleprice;
    private LocalDate saledate;

    public salestransaction() {
    }

    public salestransaction(String productname, int quantity, int saleprice, LocalDate saledate) {
        this.productname = productname;
        this.quantity = quantity;
        this.saleprice = saleprice;
        this.saledate = saledate;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getSaleprice() {
        return saleprice;
    }

    public void setSaleprice(int saleprice) {
        this.saleprice = saleprice;
    }

    public LocalDate getSaledate() {
        return saledate;
    }

    public void setSaledate(LocalDate saledate) {
        this.saledate = saledate;
    }

    @Override
    public String toString() {
        return "salestransaction{" +
                "productname='" + productname + '\'' +
                ", quantity=" + quantity +
                ", saleprice=" + saleprice +
                ", saledate=" + saledate +
                '}';
    }
}
