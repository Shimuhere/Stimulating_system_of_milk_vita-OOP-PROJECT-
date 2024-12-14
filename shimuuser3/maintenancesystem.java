package org.example.stimulating_system_of_milk_vita.shimuuser3;

public class maintenancesystem {
    private String select_machine;
    private String describe_issue;
    private String select_urgency;

    public maintenancesystem(String select_machine, String describe_issue, String select_urgency) {
        this.select_machine = select_machine;
        this.describe_issue = describe_issue;
        this.select_urgency = select_urgency;
    }

    public String getSelect_machine() {
        return select_machine;
    }

    public void setSelect_machine(String select_machine) {
        this.select_machine = select_machine;
    }

    public String getDescribe_issue() {
        return describe_issue;
    }

    public void setDescribe_issue(String describe_issue) {
        this.describe_issue = describe_issue;
    }

    public String getSelect_urgency() {
        return select_urgency;
    }

    public void setSelect_urgency(String select_urgency) {
        this.select_urgency = select_urgency;
    }

    @Override
    public String toString() {
        return "maintenancesystem{" +
                "select_machine='" + select_machine + '\'' +
                ", describe_issue='" + describe_issue + '\'' +
                ", select_urgency='" + select_urgency + '\'' +
                '}';
    }

    public maintenancesystem() {



    }
}
