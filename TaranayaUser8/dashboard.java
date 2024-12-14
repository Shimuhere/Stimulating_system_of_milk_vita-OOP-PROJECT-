package com.example.milkvitaproject.TaranayaUser8;

public class dashboard {
    private String rawMaterialStatus;
    private String stockInformation;
    private String orderStatus;
    private String deliverySchedule;
    private String productReturnStatus;
    private String supplyRequestResponse;
    private String competitivePricing;
    private String supplyChainIssueStatus;

    public dashboard(String rawMaterialStatus, String orderStatus, String stockInformation, String productReturnStatus, String deliverySchedule, String supplyRequestResponse, String competitivePricing, String supplyChainIssueStatus) {
        this.rawMaterialStatus = rawMaterialStatus;
        this.orderStatus = orderStatus;
        this.stockInformation = stockInformation;
        this.productReturnStatus = productReturnStatus;
        this.deliverySchedule = deliverySchedule;
        this.supplyRequestResponse = supplyRequestResponse;
        this.competitivePricing = competitivePricing;
        this.supplyChainIssueStatus = supplyChainIssueStatus;
    }

    public String getSupplyRequestResponse() {
        return supplyRequestResponse;
    }

    public void setSupplyRequestResponse(String supplyRequestResponse) {
        this.supplyRequestResponse = supplyRequestResponse;
    }

    public String getCompetitivePricing() {
        return competitivePricing;
    }

    public void setCompetitivePricing(String competitivePricing) {
        this.competitivePricing = competitivePricing;
    }

    public String getSupplyChainIssueStatus() {
        return supplyChainIssueStatus;
    }

    public void setSupplyChainIssueStatus(String supplyChainIssueStatus) {
        this.supplyChainIssueStatus = supplyChainIssueStatus;
    }

    public String getProductReturnStatus() {
        return productReturnStatus;
    }

    public void setProductReturnStatus(String productReturnStatus) {
        this.productReturnStatus = productReturnStatus;
    }

    public String getDeliverySchedule() {
        return deliverySchedule;
    }

    public void setDeliverySchedule(String deliverySchedule) {
        this.deliverySchedule = deliverySchedule;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStockInformation() {
        return stockInformation;
    }

    public void setStockInformation(String stockInformation) {
        this.stockInformation = stockInformation;
    }

    public String getRawMaterialStatus() {
        return rawMaterialStatus;
    }

    public void setRawMaterialStatus(String rawMaterialStatus) {
        this.rawMaterialStatus = rawMaterialStatus;
    }

    @Override
    public String toString() {
        return "dashboard{" +
                "rawMaterialStatus='" + rawMaterialStatus + '\'' +
                ", stockInformation='" + stockInformation + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", deliverySchedule='" + deliverySchedule + '\'' +
                ", productReturnStatus='" + productReturnStatus + '\'' +
                ", supplyRequestResponse='" + supplyRequestResponse + '\'' +
                ", competitivePricing='" + competitivePricing + '\'' +
                ", supplyChainIssueStatus='" + supplyChainIssueStatus + '\'' +
                '}';
    }
}
