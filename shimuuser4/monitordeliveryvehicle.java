package org.example.stimulating_system_of_milk_vita.shimuuser4;

public class monitordeliveryvehicle {
    private int VehicleID;
    private String delivery_time;
    private String current_status;
    private String issue_identified;

    public monitordeliveryvehicle(int vehicleID, String delivery_time, String current_status, String issue_identified) {
        VehicleID = vehicleID;
        this.delivery_time = delivery_time;
        this.current_status = current_status;
        this.issue_identified = issue_identified;
    }

    public int getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(int vehicleID) {
        VehicleID = vehicleID;
    }

    public String getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(String delivery_time) {
        this.delivery_time = delivery_time;
    }

    public String getCurrent_status() {
        return current_status;
    }

    public void setCurrent_status(String current_status) {
        this.current_status = current_status;
    }

    public String getIssue_identified() {
        return issue_identified;
    }

    public void setIssue_identified(String issue_identified) {
        this.issue_identified = issue_identified;
    }

    @Override
    public String toString() {
        return "monitordeliveryvehicle{" +
                "VehicleID=" + VehicleID +
                ", delivery_time='" + delivery_time + '\'' +
                ", current_status='" + current_status + '\'' +
                ", issue_identified='" + issue_identified + '\'' +
                '}';
    }

    public monitordeliveryvehicle() {



    }
}
