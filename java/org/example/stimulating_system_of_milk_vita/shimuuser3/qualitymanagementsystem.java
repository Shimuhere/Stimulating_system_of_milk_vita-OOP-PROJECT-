package org.example.stimulating_system_of_milk_vita.shimuuser3;

public class qualitymanagementsystem {
    private String current_production_batch;
    private int temperature , weight;

    public qualitymanagementsystem(String current_production_batch, int temperature, int weight) {
        this.current_production_batch = current_production_batch;
        this.temperature = temperature;
        this.weight = weight;
    }

    public String getCurrent_production_batch() {
        return current_production_batch;
    }

    public void setCurrent_production_batch(String current_production_batch) {
        this.current_production_batch = current_production_batch;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "qualitymanagementsystem{" +
                "current_production_batch='" + current_production_batch + '\'' +
                ", temperature=" + temperature +
                ", weight=" + weight +
                '}';
    }

    public qualitymanagementsystem() {



    }
}
