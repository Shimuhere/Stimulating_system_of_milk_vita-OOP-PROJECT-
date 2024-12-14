package com.example.project_milkvita.TayyibaUser5;

import java.time.LocalDate;

public class salesdata {
    private String productname;
    private String quantity;
    private LocalDate salesdate;

    public salesdata() {
    }

    public salesdata(String productname, String quantity, LocalDate salesdate) {
        this.productname = productname;
        this.quantity = quantity;
        this.salesdate = salesdate;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public LocalDate getSalesdate() {
        return salesdate;
    }

    public void setSalesdate(LocalDate salesdate) {
        this.salesdate = salesdate;
    }

    @Override
    public String toString() {
        return "salesdata{" +
                "productname='" + productname + '\'' +
                ", quantity='" + quantity + '\'' +
                ", salesdate=" + salesdate +
                '}';
    }
}
