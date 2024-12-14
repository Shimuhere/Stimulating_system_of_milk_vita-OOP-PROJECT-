package com.example.project_milkvita.TayyibaUser5;

public class stocklevel {
    private String productname;
    private String requiredquantity,currentquantity;
    private String status;

    public stocklevel() {
    }

    public stocklevel(String productname, String requiredquantity, String currentquantity, String status) {
        this.productname = productname;
        this.requiredquantity = requiredquantity;
        this.currentquantity = currentquantity;
        this.status = status;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getRequiredquantity() {
        return requiredquantity;
    }

    public void setRequiredquantity(String requiredquantity) {
        this.requiredquantity = requiredquantity;
    }

    public String getCurrentquantity() {
        return currentquantity;
    }

    public void setCurrentquantity(String currentquantity) {
        this.currentquantity = currentquantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "stocklevel{" +
                "productname='" + productname + '\'' +
                ", requiredquantity='" + requiredquantity + '\'' +
                ", currentquantity='" + currentquantity + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
