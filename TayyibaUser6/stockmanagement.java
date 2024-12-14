package com.example.project_milkvita.TayyibaUser6;

public class stockmanagement {
    private String productname, currentstocklevel, newstocklevel;

    public stockmanagement() {
    }

    public stockmanagement(String productname, String currentstocklevel, String newstocklevel) {
        this.productname = productname;
        this.currentstocklevel = currentstocklevel;
        this.newstocklevel = newstocklevel;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getCurrentstocklevel() {
        return currentstocklevel;
    }

    public void setCurrentstocklevel(String currentstocklevel) {
        this.currentstocklevel = currentstocklevel;
    }

    public String getNewstocklevel() {
        return newstocklevel;
    }

    public void setNewstocklevel(String newstocklevel) {
        this.newstocklevel = newstocklevel;
    }

    @Override
    public String toString() {
        return "stockmanagement{" +
                "productname='" + productname + '\'' +
                ", currentstocklevel='" + currentstocklevel + '\'' +
                ", newstocklevel='" + newstocklevel + '\'' +
                '}';
    }
}
