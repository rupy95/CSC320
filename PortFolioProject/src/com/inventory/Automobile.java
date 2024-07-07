package com.inventory;

public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
    }

    public Automobile(String make, String model, String color, int year, int mileage) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
    }

    public void addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } catch (Exception e) {
            System.out.println("Failed to add vehicle: " + e.getMessage());
        }
    }

    public String[] listVehicle() {
        try {
            return new String[]{this.make, this.model, this.color, String.valueOf(this.year), String.valueOf(this.mileage)};
        } catch (Exception e) {
            System.out.println("Failed to list vehicle: " + e.getMessage());
            return new String[]{};
        }
    }

    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
            return "Vehicle removed successfully.";
        } catch (Exception e) {
            return "Failed to remove vehicle: " + e.getMessage();
        }
    }

    public String updateVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
            return "Vehicle updated successfully.";
        } catch (Exception e) {
            return "Failed to update vehicle: " + e.getMessage();
        }
    }
}
