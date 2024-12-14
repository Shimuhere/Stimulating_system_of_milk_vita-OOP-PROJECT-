package com.example.project_milkvita.TayyibaUser6;

public class placeorder {
    private String productname;
    private int quantity;
    private String deliveryaddress;

    public placeorder() {
    }

    public placeorder(String productname, int quantity, String deliveryaddress) {
        this.productname = productname;
        this.quantity = quantity;
        this.deliveryaddress = deliveryaddress;
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

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    @Override
    public String toString() {
        return "placeorder{" +
                "productname='" + productname + '\'' +
                ", quantity=" + quantity +
                ", deliveryaddress='" + deliveryaddress + '\'' +
                '}';
    }
}
