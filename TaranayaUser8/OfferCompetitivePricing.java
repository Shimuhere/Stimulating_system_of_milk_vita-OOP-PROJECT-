package com.example.milkvitaproject.TaranayaUser8;

public class OfferCompetitivePricing {

    private String materialId;
    private double currentPrice;

    public OfferCompetitivePricing(String materialId, double currentPrice) {
        this.materialId = materialId;
        this.currentPrice = currentPrice;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "OfferCompetitivePricing{" +
                "materialId='" + materialId + '\'' +
                ", currentPrice=" + currentPrice +
                '}';
    }
}
