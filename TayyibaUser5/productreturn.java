package com.example.project_milkvita.TayyibaUser5;

public class productreturn {
    private String productname;
    private int quantity;
    private String reason;

    public productreturn() {
    }

    public productreturn(String productname, int quantity, String reason) {
        this.productname = productname;
        this.quantity = quantity;
        this.reason = reason;
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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "productreturn{" +
                "productname='" + productname + '\'' +
                ", quantity='" + quantity + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }
}
