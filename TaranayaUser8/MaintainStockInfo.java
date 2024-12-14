package com.example.milkvitaproject.TaranayaUser8;

public class MaintainStockInfo {
    private String materialId;
    private int stockLevel;

    public MaintainStockInfo(String materialId, int stockLevel) {
        this.materialId = materialId;
        this.stockLevel = stockLevel;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    @Override
    public String toString() {
        return "MaintainStockInfo{" +
                "materialId='" + materialId + '\'' +
                ", stockLevel=" + stockLevel +
                '}';
    }
}
