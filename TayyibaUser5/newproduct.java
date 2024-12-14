package com.example.project_milkvita.TayyibaUser5;

public class newproduct {
    private String productname;
    private String price;
    private String stocklevel;

    public newproduct() {
    }

    public newproduct(String productname, String price, String stocklevel) {
        this.productname = productname;
        this.price = price;
        this.stocklevel = stocklevel;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStocklevel() {
        return stocklevel;
    }

    public void setStocklevel(String stocklevel) {
        this.stocklevel = stocklevel;
    }

    @Override
    public String toString() {
        return "newproduct{" +
                "productname='" + productname + '\'' +
                ", price=" + price +
                ", stocklevel='" + stocklevel + '\'' +
                '}';
    }
}
