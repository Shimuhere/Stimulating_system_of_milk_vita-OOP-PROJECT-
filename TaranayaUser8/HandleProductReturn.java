package com.example.milkvitaproject.TaranayaUser8;

public class HandleProductReturn{

    private String productId;
    private String reason;
    private String status;

    public HandleProductReturn(String productId, String reason, String status) {
        this.productId = productId;
        this.reason = reason;
        this.status = status;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "HandleProductReturn{" +
                "productId='" + productId + '\'' +
                ", reason='" + reason + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

