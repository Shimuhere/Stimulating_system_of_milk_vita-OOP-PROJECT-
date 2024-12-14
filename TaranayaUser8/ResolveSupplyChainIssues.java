package com.example.milkvitaproject.TaranayaUser8;

public class ResolveSupplyChainIssues {

    private String issueId;
    private String issueType;
    private String status;
    private String resolution;

    public ResolveSupplyChainIssues(String issueId, String resolution, String status, String issueType) {
        this.issueId = issueId;
        this.resolution = resolution;
        this.status = status;
        this.issueType = issueType;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "ResolveSupplyChainIssues{" +
                "issueId='" + issueId + '\'' +
                ", issueType='" + issueType + '\'' +
                ", status='" + status + '\'' +
                ", resolution='" + resolution + '\'' +
                '}';
    }
}
