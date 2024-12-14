package org.example.stimulating_system_of_milk_vita.shimuuser3;

public class energymonitoring { ;
    private String machine_name;
    private String energy_consumption;
    private String Status;

    public energymonitoring(String machine_name, String energy_consumption, String status) {
        this.machine_name = machine_name;
        this.energy_consumption = energy_consumption;
        Status = status;
    }

    public String getMachine_name() {
        return machine_name;
    }

    public void setMachine_name(String machine_name) {
        this.machine_name = machine_name;
    }

    public String getEnergy_consumption() {
        return energy_consumption;
    }

    public void setEnergy_consumption(String energy_consumption) {
        this.energy_consumption = energy_consumption;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "energymonitoring{" +
                "machine_name='" + machine_name + '\'' +
                ", energy_consumption='" + energy_consumption + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }

    public energymonitoring() {



    }
}
