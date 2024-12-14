package org.example.stimulating_system_of_milk_vita.shimuuser4;

public class vehicleassignment {
    private int deliver_id, capacity;
    private String status;
    private String delivery_route, assign_vehicle;

    public vehicleassignment(int deliver_id, int capacity, String status, String delivery_route, String assign_vehicle) {
        this.deliver_id = deliver_id;
        this.capacity = capacity;
        this.status = status;
        this.delivery_route = delivery_route;
        this.assign_vehicle = assign_vehicle;
    }

    public int getDeliver_id() {
        return deliver_id;
    }

    public void setDeliver_id(int deliver_id) {
        this.deliver_id = deliver_id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDelivery_route() {
        return delivery_route;
    }

    public void setDelivery_route(String delivery_route) {
        this.delivery_route = delivery_route;
    }

    public String getAssign_vehicle() {
        return assign_vehicle;
    }

    public void setAssign_vehicle(String assign_vehicle) {
        this.assign_vehicle = assign_vehicle;
    }

    @Override
    public String toString() {
        return "vehicleassignment{" +
                "deliver_id=" + deliver_id +
                ", capacity=" + capacity +
                ", status='" + status + '\'' +
                ", delivery_route='" + delivery_route + '\'' +
                ", assign_vehicle='" + assign_vehicle + '\'' +
                '}';
    }

    public vehicleassignment() {



    }
}
