package org.example.stimulating_system_of_milk_vita.shimuuser3;

public class supplymanagement {
    private String material_name;
    private int Current_stock;
    private int required_stock;

    public supplymanagement(String material_name, int current_stock, int required_stock) {
        this.material_name = material_name;
        Current_stock = current_stock;
        this.required_stock = required_stock;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }

    public int getCurrent_stock() {
        return Current_stock;
    }

    public void setCurrent_stock(int current_stock) {
        Current_stock = current_stock;
    }

    public int getRequired_stock() {
        return required_stock;
    }

    public void setRequired_stock(int required_stock) {
        this.required_stock = required_stock;
    }

    @Override
    public String toString() {
        return "supplymanagement{" +
                "material_name='" + material_name + '\'' +
                ", Current_stock=" + Current_stock +
                ", required_stock=" + required_stock +
                '}';
    }

    public supplymanagement() {



    }
}
