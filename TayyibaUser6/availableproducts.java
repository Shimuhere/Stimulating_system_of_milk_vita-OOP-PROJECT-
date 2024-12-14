package com.example.project_milkvita.TayyibaUser6;

public class availableproducts {
    private String productname;
    private String stockquantity, price;

    public availableproducts() {
    }

    public availableproducts(String productname, String stockquantity, String price) {
        this.productname = productname;
        this.stockquantity = stockquantity;
        this.price = price;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getStockquantity() {
        return stockquantity;
    }

    public void setStockquantity(String stockquantity) {
        this.stockquantity = stockquantity;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "availableproducts{" +
                "productname='" + productname + '\'' +
                ", stockquantity=" + stockquantity +
                ", price=" + price +
                '}';
    }
}
