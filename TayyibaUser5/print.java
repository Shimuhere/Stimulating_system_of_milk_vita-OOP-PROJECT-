package com.example.project_milkvita.TayyibaUser5;

import java.time.LocalDate;

public class print {
    private final  String retailername;
    private final String productname;
    private final int quantity;
    private final LocalDate dateofsale;



    public print(String retailername, String productname, int quantity, LocalDate dateofsale) {
        this.retailername = retailername;
        this.productname = productname;
        this.quantity = quantity;
        this.dateofsale = dateofsale;
    }

    public String getRetailername() {
        return retailername;
    }

    public String getProductname() {
        return productname;
    }

    public int getQuantity() {
        return quantity;
    }

    public LocalDate getDateofsale() {
        return dateofsale;
    }

    @Override
    public String toString() {
        return "print{" +
                "retailername='" + retailername + '\'' +
                ", productname='" + productname + '\'' +
                ", quantity=" + quantity +
                ", dateofsale=" + dateofsale +
                '}';
    }
}
