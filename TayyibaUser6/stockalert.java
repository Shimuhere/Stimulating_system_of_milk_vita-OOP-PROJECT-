package com.example.project_milkvita.TayyibaUser6;

public class stockalert {
    private String productname;
    private int totalstock,currentstock;
    private String alertstatus;

    public stockalert() {
    }

    public stockalert(String productname, int totalstock, int currentstock, String alertstatus) {
        this.productname = productname;
        this.totalstock = totalstock;
        this.currentstock = currentstock;
        this.alertstatus = alertstatus;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getTotalstock() {
        return totalstock;
    }

    public void setTotalstock(int totalstock) {
        this.totalstock = totalstock;
    }

    public int getCurrentstock() {
        return currentstock;
    }

    public void setCurrentstock(int currentstock) {
        this.currentstock = currentstock;
    }

    public String getAlertstatus() {
        return alertstatus;
    }

    public void setAlertstatus(String alertstatus) {
        this.alertstatus = alertstatus;
    }

    @Override
    public String toString() {
        return "stockalert{" +
                "productname='" + productname + '\'' +
                ", totalstock=" + totalstock +
                ", currentstock=" + currentstock +
                ", alertstatus='" + alertstatus + '\'' +
                '}';
    }
}
