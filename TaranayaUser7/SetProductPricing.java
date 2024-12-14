package com.example.milkvitaproject.TaranayaUser7;

public class SetProductPricing {
    private String productName;
    private String currentPrice;

    public SetProductPricing(String productName, String currentPrice) {
        this.productName = productName;
        this.currentPrice = currentPrice;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "SetProductPricing{" +
                "productName='" + productName + '\'' +
                ", currentPrice='" + currentPrice + '\'' +
                '}';
    }
}
