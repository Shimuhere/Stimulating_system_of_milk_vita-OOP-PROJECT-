package org.example.stimulating_system_of_milk_vita.shimuuser3;

public class dailyproduction {
    private  String production_target;
    private String total_units ;
    private String defective_units;
    private String batch_status;

    public dailyproduction(String production_target, String total_units, String defective_units, String batch_status) {
        this.production_target = production_target;
        this.total_units = total_units;
        this.defective_units = defective_units;
        this.batch_status = batch_status;
    }

    public String getProduction_target() {
        return production_target;
    }

    public void setProduction_target(String production_target) {
        this.production_target = production_target;
    }

    public String getTotal_units() {
        return total_units;
    }

    public void setTotal_units(String total_units) {
        this.total_units = total_units;
    }

    public String getDefective_units() {
        return defective_units;
    }

    public void setDefective_units(String defective_units) {
        this.defective_units = defective_units;
    }

    public String getBatch_status() {
        return batch_status;
    }

    public void setBatch_status(String batch_status) {
        this.batch_status = batch_status;
    }

    @Override
    public String toString() {
        return "dailyproduction{" +
                "production_target='" + production_target + '\'' +
                ", total_units='" + total_units + '\'' +
                ", defective_units='" + defective_units + '\'' +
                ", batch_status='" + batch_status + '\'' +
                '}';
    }

    public dailyproduction() {



    }
}
