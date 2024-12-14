package com.example.project_milkvita.TayyibaUser5;

public class assignedretailer {
    private String retailername;
    private String phonenumber;
    private String shopname;
    private String shopaddress;

    public assignedretailer() {
    }

    public assignedretailer(String retailername, String phonenumber, String shopname, String shopaddress) {
        this.retailername = retailername;
        this.phonenumber = phonenumber;
        this.shopname = shopname;
        this.shopaddress = shopaddress;
    }

    public String getRetailername() {
        return retailername;
    }

    public void setRetailername(String retailername) {
        this.retailername = retailername;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getShopaddress() {
        return shopaddress;
    }

    public void setShopaddress(String shopaddress) {
        this.shopaddress = shopaddress;
    }

    @Override
    public String toString() {
        return "assignedretailer{" +
                "retailername='" + retailername + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", shopname='" + shopname + '\'' +
                ", shopaddress='" + shopaddress + '\'' +
                '}';
    }
}
