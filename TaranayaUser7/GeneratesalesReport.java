package com.example.milkvitaproject.TaranayaUser7;

public class GeneratesalesReport {
    private String productId;
    private String sales;
    private String revenue;


    public GeneratesalesReport(String revenue, String productId, String sales) {
        this.revenue = revenue;
        this.productId = productId;
        this.sales = sales;


    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;

    }

    @Override
    public String toString() {
        return "GeneratesalesReport{" +
                "productId='" + productId + '\'' +
                ", sales='" + sales + '\'' +
                ", revenue='" + revenue + '\'' +
                '}';
    }



