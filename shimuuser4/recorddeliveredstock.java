package org.example.stimulating_system_of_milk_vita.shimuuser4;

public class recorddeliveredstock {
    private int delivery_id;
    private String product_name, status,expected_quality;

    public recorddeliveredstock(int delivery_id, String product_name, String status, String expected_quality) {
        this.delivery_id = delivery_id;
        this.product_name = product_name;
        this.status = status;
        this.expected_quality = expected_quality;
    }

    public int getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(int delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpected_quality() {
        return expected_quality;
    }

    public void setExpected_quality(String expected_quality) {
        this.expected_quality = expected_quality;
    }

    @Override
    public String toString() {
        return "recorddeliveredstock{" +
                "delivery_id=" + delivery_id +
                ", product_name='" + product_name + '\'' +
                ", status='" + status + '\'' +
                ", expected_quality='" + expected_quality + '\'' +
                '}';
    }

    public recorddeliveredstock() {



    }
}
