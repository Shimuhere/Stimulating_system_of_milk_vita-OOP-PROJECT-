package org.example.stimulating_system_of_milk_vita.shimuuser4;

import java.time.LocalDate;

public class fleetmaintenance {
    private String Vehicle_id, maintenance_log;
    private LocalDate maintenance_date, reschedule_date;

    public fleetmaintenance(String vehicle_id, String maintenance_log, LocalDate maintenance_date, LocalDate reschedule_date) {
        Vehicle_id = vehicle_id;
        this.maintenance_log = maintenance_log;
        this.maintenance_date = maintenance_date;
        this.reschedule_date = reschedule_date;
    }

    public String getVehicle_id() {
        return Vehicle_id;
    }

    public void setVehicle_id(String vehicle_id) {
        Vehicle_id = vehicle_id;
    }

    public String getMaintenance_log() {
        return maintenance_log;
    }

    public void setMaintenance_log(String maintenance_log) {
        this.maintenance_log = maintenance_log;
    }

    public LocalDate getMaintenance_date() {
        return maintenance_date;
    }

    public void setMaintenance_date(LocalDate maintenance_date) {
        this.maintenance_date = maintenance_date;
    }

    public LocalDate getReschedule_date() {
        return reschedule_date;
    }

    public void setReschedule_date(LocalDate reschedule_date) {
        this.reschedule_date = reschedule_date;
    }

    @Override
    public String toString() {
        return "fleetmaintenance{" +
                "Vehicle_id='" + Vehicle_id + '\'' +
                ", maintenance_log='" + maintenance_log + '\'' +
                ", maintenance_date=" + maintenance_date +
                ", reschedule_date=" + reschedule_date +
                '}';
    }

    public fleetmaintenance() {



    }
}
