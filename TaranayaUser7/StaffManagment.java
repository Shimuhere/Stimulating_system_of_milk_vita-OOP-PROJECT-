package com.example.milkvitaproject.TaranayaUser7;

public class StaffManagment {
    private String name;
    private String role;
    private String shift;

    public StaffManagment(String name, String role, String shift) {
        this.name = name;
        this.role = role;
        this.shift = shift;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "StaffManagment{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", shift='" + shift + '\'' +
                '}';
    }
}

