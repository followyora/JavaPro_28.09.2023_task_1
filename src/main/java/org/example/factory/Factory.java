package org.example.factory;

import org.example.cars.Automobile;


public class Factory {

    // Метод для производства спорткара
    public static Automobile produceSportsCar(String model, int enginePower, String brand) {
        Automobile sportsCar = new Automobile();
        sportsCar.type = Automobile.CarType.SPORTS_CAR;
        sportsCar.model = model;
        sportsCar.setEnginePower(enginePower);
        sportsCar.setBrand(brand);
        return sportsCar;
    }

    // Метод для производства грузовика
    public static Automobile produceTruck(String model, int enginePower, String brand) {
        Automobile truck = new Automobile();
        truck.type = Automobile.CarType.TRUCK;
        truck.model = model;
        truck.setEnginePower(enginePower);
        truck.setBrand(brand);
        return truck;
    }

    // Метод для производства легкового автомобиля
    public static Automobile produceSedan(String model, int enginePower, String brand) {
        Automobile sedan = new Automobile();
        sedan.type = Automobile.CarType.SEDAN;
        sedan.model = model;
        sedan.setEnginePower(enginePower);
        sedan.setBrand(brand);
        return sedan;
    }


}


