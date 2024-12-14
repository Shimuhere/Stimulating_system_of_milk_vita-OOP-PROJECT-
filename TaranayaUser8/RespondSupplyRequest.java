package com.example.milkvitaproject.TaranayaUser8;

public class RespondSupplyRequest {
    private String materialId;
    private String requestId;
    private String status;
    private String response;

    public RespondSupplyRequest(String materialId, String requestId, String status, String response) {
        this.materialId = materialId;
        this.requestId = requestId;
        this.status = status;
        this.response = response;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "RespondSupplyRequest{" +
                "materialId='" + materialId + '\'' +
                ", requestId='" + requestId + '\'' +
                ", status='" + status + '\'' +
                ", response='" + response + '\'' +
                '}';
    }
}
