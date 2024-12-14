package com.example.project_milkvita.TayyibaUser6;

public class managediscounts {
    private String productname;
    private String currentprice;

    public managediscounts() {
    }

    public managediscounts(String productname, String currentprice) {
        this.productname = productname;
        this.currentprice = currentprice;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getCurrentprice() {
        return currentprice;
    }

    public void setCurrentprice(String currentprice) {
        this.currentprice = currentprice;
    }

    @Override
    public String toString() {
        return "managediscounts{" +
                "productname='" + productname + '\'' +
                ", currentprice='" + currentprice + '\'' +
                '}';
    }
}
