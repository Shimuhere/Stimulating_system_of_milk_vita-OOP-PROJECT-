package org.example.stimulating_system_of_milk_vita.shimuuser4;

import java.time.LocalDate;

public class performancereports {
    private LocalDate reporting_date;
    private String overall_performance;

    public performancereports(LocalDate reporting_date, String overall_performance) {
        this.reporting_date = reporting_date;
        this.overall_performance = overall_performance;
    }

    public LocalDate getReporting_date() {
        return reporting_date;
    }

    public void setReporting_date(LocalDate reporting_date) {
        this.reporting_date = reporting_date;
    }

    public String getOverall_performance() {
        return overall_performance;
    }

    public void setOverall_performance(String overall_performance) {
        this.overall_performance = overall_performance;
    }

    @Override
    public String toString() {
        return "performancereports{" +
                "reporting_date=" + reporting_date +
                ", overall_performance='" + overall_performance + '\'' +
                '}';
    }

    public performancereports() {



    }
}
