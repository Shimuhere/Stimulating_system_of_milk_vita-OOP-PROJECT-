package org.example.stimulating_system_of_milk_vita.shimuuser3;


import java.time.LocalDate;

public class attendancerecords {
    private LocalDate Date;
    private String status;
    private String remarks;

    public attendancerecords() {
    }

    public attendancerecords(LocalDate date, String status, String remarks) {
        Date = date;
        this.status = status;
        this.remarks = remarks;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "attendancerecords{" +
                "Date=" + Date +
                ", status='" + status + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}