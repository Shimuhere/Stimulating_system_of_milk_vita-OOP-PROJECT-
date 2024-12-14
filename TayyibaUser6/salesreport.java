package com.example.project_milkvita.TayyibaUser6;

public class salesreport {
    private String productname;
    private int quantitysold;
    private int totalsale;

    public salesreport() {
    }

    public salesreport(String productname, int quantitysold, int totalsale) {
        this.productname = productname;
        this.quantitysold = quantitysold;
        this.totalsale = totalsale;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public int getQuantitysold() {
        return quantitysold;
    }

    public void setQuantitysold(int quantitysold) {
        this.quantitysold = quantitysold;
    }

    public int getTotalsale() {
        return totalsale;
    }

    public void setTotalsale(int totalsale) {
        this.totalsale = totalsale;
    }

    @Override
    public String toString() {
        return "salesreport{" +
                "productname='" + productname + '\'' +
                ", quantitysold=" + quantitysold +
                ", totalsale=" + totalsale +
                '}';
    }
}
