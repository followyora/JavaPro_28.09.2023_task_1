package org.example.cars;

public class Automobile {
    public enum CarType {
        TRUCK, SPORTS_CAR, SEDAN
    }

    // Публичное поле
    public CarType type;

    //Поле без модификатора доступа
    public String model;

    //Приватные поля
    private int enginePower;
    private String brand;

    public Automobile() {
        //Легковой по умолчанию
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
