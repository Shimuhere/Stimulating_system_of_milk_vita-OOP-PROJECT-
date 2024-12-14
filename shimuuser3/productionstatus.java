package org.example.stimulating_system_of_milk_vita.shimuuser3;

public class productionstatus {
    private String Production_batch;
    private String batch_status;
    private String additional_notes;

    public productionstatus(String production_batch, String batch_status, String additional_notes) {
        Production_batch = production_batch;
        this.batch_status = batch_status;
        this.additional_notes = additional_notes;
    }

    public String getProduction_batch() {
        return Production_batch;
    }

    public void setProduction_batch(String production_batch) {
        Production_batch = production_batch;
    }

    public String getBatch_status() {
        return batch_status;
    }

    public void setBatch_status(String batch_status) {
        this.batch_status = batch_status;
    }

    public String getAdditional_notes() {
        return additional_notes;
    }

    public void setAdditional_notes(String additional_notes) {
        this.additional_notes = additional_notes;
    }

    @Override
    public String toString() {
        return "productionstatus{" +
                "Production_batch='" + Production_batch + '\'' +
                ", batch_status='" + batch_status + '\'' +
                ", additional_notes='" + additional_notes + '\'' +
                '}';
    }

    public productionstatus() {



    }
}
