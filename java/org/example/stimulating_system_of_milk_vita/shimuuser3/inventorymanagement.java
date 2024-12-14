package org.example.stimulating_system_of_milk_vita.shimuuser3;

public class inventorymanagement {
    private String select_material;
    private String stock_level;

    public inventorymanagement(String select_material, String stock_level) {
        this.select_material = select_material;
        this.stock_level = stock_level;
    }

    public String getSelect_material() {
        return select_material;
    }

    public void setSelect_material(String select_material) {
        this.select_material = select_material;
    }

    public String getStock_level() {
        return stock_level;
    }

    public void setStock_level(String stock_level) {
        this.stock_level = stock_level;
    }

    @Override
    public String toString() {
        return "inventorymanagement{" +
                "select_material='" + select_material + '\'' +
                ", stock_level='" + stock_level + '\'' +
                '}';
    }

    public inventorymanagement() {



    }
}
