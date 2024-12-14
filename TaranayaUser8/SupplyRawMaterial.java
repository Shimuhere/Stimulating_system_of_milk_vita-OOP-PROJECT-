package com.example.milkvitaproject.TaranayaUser8;

public class SupplyRawMaterial {
    private String materialId;
    private int currentStock;

    public SupplyRawMaterial(String materialId, int currentStock) {
        this.materialId = materialId;
        this.currentStock = currentStock;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public int getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(int currentStock) {
        this.currentStock = currentStock;
    }

    @Override
    public String toString() {
        return "SupplyRawMaterial{" +
                "materialId='" + materialId + '\'' +
                ", currentStock=" + currentStock +
                '}';
    }
}
