package com.example.milkvitaproject.TaranayaUser7;

public class InventoryManagment {

    private String productName;
    private String currentStock;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(String currentStock) {
        this.currentStock = currentStock;
    }

    @Override
    public String toString() {
        return "InventoryManagment{" +
                "productName='" + productName + '\'' +
                ", currentStock='" + currentStock + '\'' +
                '}';
    }

    public InventoryManagment(String productName, String currentStock) {
        this.productName = productName;
        this.currentStock = currentStock;




    }


}
