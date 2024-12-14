package com.example.milkvitaproject.TaranayaUser8;

public class TrackOrderStatus {
    private String customerName;
    private String orderId;
    private String status;

    public TrackOrderStatus(String customerName, String status, String orderId) {
        this.customerName = customerName;
        this.status = status;
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "TrackOrderStatus{" +
                "customerName='" + customerName + '\'' +
                ", orderId='" + orderId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
