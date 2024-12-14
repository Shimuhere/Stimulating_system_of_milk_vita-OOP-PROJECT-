package com.example.milkvitaproject.TaranayaUser7;

public class Dashboard {
    private String deliveryStatus;
    private String salesReport;
    private String customerComplaint;
    private int inventoryLevel;
    private String qualityStatus;
    private double productPrice;
    private String staffInfo;
    private String supplierInfo;

    public Dashboard(String salesReport, String customerComplaint, int inventoryLevel, String qualityStatus, double productPrice, String staffInfo, String supplierInfo, String deliveryStatus) {
        this.salesReport = salesReport;
        this.customerComplaint = customerComplaint;
        this.inventoryLevel = inventoryLevel;
        this.qualityStatus = qualityStatus;
        this.productPrice = productPrice;
        this.staffInfo = staffInfo;
        this.supplierInfo = supplierInfo;
        this.deliveryStatus = deliveryStatus;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public String getSalesReport() {
        return salesReport;
    }

    public void setSalesReport(String salesReport) {
        this.salesReport = salesReport;
    }

    public String getCustomerComplaint() {
        return customerComplaint;
    }

    public void setCustomerComplaint(String customerComplaint) {
        this.customerComplaint = customerComplaint;
    }

    public int getInventoryLevel() {
        return inventoryLevel;
    }

    public void setInventoryLevel(int inventoryLevel) {
        this.inventoryLevel = inventoryLevel;
    }

    public String getQualityStatus() {
        return qualityStatus;
    }

    public void setQualityStatus(String qualityStatus) {
        this.qualityStatus = qualityStatus;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getStaffInfo() {
        return staffInfo;
    }

    public void setStaffInfo(String staffInfo) {
        this.staffInfo = staffInfo;
    }

    public String getSupplierInfo() {
        return supplierInfo;
    }

    public void setSupplierInfo(String supplierInfo) {
        this.supplierInfo = supplierInfo;
    }

    @Override
    public String toString() {
        return "Dashboard{" +
                "deliveryStatus='" + deliveryStatus + '\'' +
                ", salesReport='" + salesReport + '\'' +
                ", customerComplaint='" + customerComplaint + '\'' +
                ", inventoryLevel=" + inventoryLevel +
                ", qualityStatus='" + qualityStatus + '\'' +
                ", productPrice=" + productPrice +
                ", staffInfo='" + staffInfo + '\'' +
                ", supplierInfo='" + supplierInfo + '\'' +
                '}';
    }
}
