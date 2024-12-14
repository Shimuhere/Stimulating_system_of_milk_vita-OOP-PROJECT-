package org.example.stimulating_system_of_milk_vita.shimuuser4;

public class stockorders {
    private int Delivery_id;
    private String product_name, Status,expected_quality;

    public stockorders(int delivery_id, String product_name, String status, String expected_quality) {
        Delivery_id = delivery_id;
        this.product_name = product_name;
        Status = status;
        this.expected_quality = expected_quality;
    }

    public int getDelivery_id() {
        return Delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        Delivery_id = delivery_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getExpected_quality() {
        return expected_quality;
    }

    public void setExpected_quality(String expected_quality) {
        this.expected_quality = expected_quality;
    }

    @Override
    public String toString() {
        return "stockorders{" +
                "Delivery_id=" + Delivery_id +
                ", product_name='" + product_name + '\'' +
                ", Status='" + Status + '\'' +
                ", expected_quality='" + expected_quality + '\'' +
                '}';
    }

    public stockorders() {



    }
}
