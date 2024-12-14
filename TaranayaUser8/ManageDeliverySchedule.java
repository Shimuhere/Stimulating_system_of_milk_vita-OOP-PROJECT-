package com.example.milkvitaproject.TaranayaUser8;

public class ManageDeliverySchedule {
    private String date;
    private String deliveryId;
    private String status;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ManageDeliverySchedule{" +
                "date='" + date + '\'' +
                ", deliveryId='" + deliveryId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public ManageDeliverySchedule(String date, String deliveryId, String status) {
        this.date = date;
        this.deliveryId = deliveryId;
        this.status = status;




    }
}
