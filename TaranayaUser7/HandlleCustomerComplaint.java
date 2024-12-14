package com.example.milkvitaproject.TaranayaUser7;

public class HandlleCustomerComplaint {
    private String complaintId;
    private String complaintStatus;
    private String complaintType;
    private String resolutionNote;

    public HandlleCustomerComplaint(String complaintStatus, String complaintId, String complaintType, String resolutionNote) {
        this.complaintStatus = complaintStatus;
        this.complaintId = complaintId;
        this.complaintType = complaintType;
        this.resolutionNote = resolutionNote;
    }

    public String getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(String complaintId) {
        this.complaintId = complaintId;
    }

    public String getComplaintStatus() {
        return complaintStatus;
    }

    public void setComplaintStatus(String complaintStatus) {
        this.complaintStatus = complaintStatus;
    }

    public String getComplaintType() {
        return complaintType;
    }

    public void setComplaintType(String complaintType) {
        this.complaintType = complaintType;
    }

    public String getResolutionNote() {
        return resolutionNote;
    }

    public void setResolutionNote(String resolutionNote) {
        this.resolutionNote = resolutionNote;
    }

    @Override
    public String toString() {
        return "HandlleCustomerComplaint{" +
                "complaintId='" + complaintId + '\'' +
                ", complaintStatus='" + complaintStatus + '\'' +
                ", complaintType='" + complaintType + '\'' +
                ", resolutionNote='" + resolutionNote + '\'' +
                '}';
    }
}
