package com.example.project_milkvita.TayyibaUser6;

import java.time.LocalDate;

public class receivedeliveries {
    private String productname;
    private int orderquantity;
    private LocalDate deliverydate;
    private String status;

    public receivedeliveries() {
    }

    public receivedeliveries(String productname, int orderquantity, LocalDate deliverydate, String status) {
        this.productname = productname;
        this.orderquantity = orderquantity;
        this.deliverydate = deliverydate;
        this.status = status;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getOrderquantity() {
        return orderquantity;
    }

    public void setOrderquantity(int orderquantity) {
        this.orderquantity = orderquantity;
    }

    public LocalDate getDeliverydate() {
        return deliverydate;
    }

    public void setDeliverydate(LocalDate deliverydate) {
        this.deliverydate = deliverydate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "receivedeliveries{" +
                "productname='" + productname + '\'' +
                ", orderquantity=" + orderquantity +
                ", deliverydate=" + deliverydate +
                ", status='" + status + '\'' +
                '}';
    }
}
