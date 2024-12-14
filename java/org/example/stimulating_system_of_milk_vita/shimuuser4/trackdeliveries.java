package org.example.stimulating_system_of_milk_vita.shimuuser4;

public class trackdeliveries {
    private int Delivery_id;
    private String destination,status;

    public trackdeliveries(int delivery_id, String status, String destination) {
        Delivery_id = delivery_id;
        this.status = status;
        this.destination = destination;
    }

    public int getDelivery_id() {
        return Delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        Delivery_id = delivery_id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "trackdeliveries{" +
                "Delivery_id=" + Delivery_id +
                ", destination='" + destination + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public trackdeliveries() {



    }
}
