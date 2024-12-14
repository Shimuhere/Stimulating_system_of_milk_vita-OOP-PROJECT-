package org.example.stimulating_system_of_milk_vita.shimuuser4;

import java.time.LocalDate;

public class deliverytracker {
    private int delivery_id;
    private String destination;
    private String Status;
    private LocalDate reschedule_delivery_date;

    public deliverytracker(int delivery_id, String destination, String status, LocalDate reschedule_delivery_date) {
        this.delivery_id = delivery_id;
        this.destination = destination;
        Status = status;
        this.reschedule_delivery_date = reschedule_delivery_date;
    }

    public int getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getReschedule_delivery_date() {
        return reschedule_delivery_date;
    }

    public void setReschedule_delivery_date(LocalDate reschedule_delivery_date) {
        this.reschedule_delivery_date = reschedule_delivery_date;
    }

    @Override
    public String toString() {
        return "deliverytracker{" +
                "delivery_id=" + delivery_id +
                ", destination='" + destination + '\'' +
                ", Status='" + Status + '\'' +
                ", reschedule_delivery_date=" + reschedule_delivery_date +
                '}';
    }

    public deliverytracker() {



    }
}
