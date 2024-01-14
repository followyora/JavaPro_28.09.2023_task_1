package org.example.factory;

import org.example.cars.Automobile;


public class Factory {

    // Creating sportCar
    public static Automobile produceSportsCar(String model, int enginePower, String brand) {
        Automobile sportsCar = new Automobile();
        sportsCar.type = Automobile.CarType.SPORTS_CAR;
        sportsCar.model = model;
        sportsCar.setEnginePower(enginePower);
        sportsCar.setBrand(brand);
        return sportsCar;
    }

    // Creating track
    public static Automobile produceTruck(String model, int enginePower, String brand) {
        Automobile truck = new Automobile();
        truck.type = Automobile.CarType.TRUCK;
        truck.model = model;
        truck.setEnginePower(enginePower);
        truck.setBrand(brand);
        return truck;
    }

    // Creating regular light car
    public static Automobile produceSedan(String model, int enginePower, String brand) {
        Automobile sedan = new Automobile();
        sedan.type = Automobile.CarType.SEDAN;
        sedan.model = model;
        sedan.setEnginePower(enginePower);
        sedan.setBrand(brand);
        return sedan;
    }


}


