package org.example.cars;

public class Automobile {
    public enum CarType {
        TRUCK, SPORTS_CAR, SEDAN
    }

    // Public field
    public CarType type;

    //Without modification
    public String model;

    //Private field
    private int enginePower;
    private String brand;

    public Automobile() {
        //Light car
        this.type = CarType.SEDAN;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
