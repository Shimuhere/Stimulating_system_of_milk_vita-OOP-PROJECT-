package com.example.milkvitaproject.TaranayaUser7;

public class QualityControl {

    private String inspectionDate;
    private String productList;
    private String status;

    public QualityControl(String inspectionDate, String productList, String status) {
        this.inspectionDate = inspectionDate;
        this.productList = productList;
        this.status = status;
    }

    public String getProductList() {
        return productList;
    }

    public void setProductList(String productList) {
        this.productList = productList;
    }

    public String getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(String inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "QualityControl{" +
                "inspectionDate='" + inspectionDate + '\'' +
                ", productList='" + productList + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
