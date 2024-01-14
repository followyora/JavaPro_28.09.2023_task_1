package org.example;

import org.example.cars.Automobile;

import static org.example.factory.Factory.*;

public class Main {
    public static void main(String[] args) {

        Automobile myCar = new Automobile();


        myCar.type = Automobile.CarType.SPORTS_CAR;
        // In another package myCar.model = "NONE"
        myCar.setEnginePower(500);
        myCar.setBrand("NoneBrand");
        //empty git practice

        //Info about car
        System.out.println("Type: " + myCar.type);
        System.out.println("Model: No access ");
        System.out.println("Engine power : " + myCar.getEnginePower() + "HP");
        System.out.println("Brand: " + myCar.getBrand());

        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");

        // Factory
        Automobile sportsCar = produceSportsCar(" Sport", 400, "Speed Motors");
        Automobile truck = produceTruck("Big Hauler", 500, "Heavy Trucks");
        Automobile sedan = produceSedan("Family Car", 200, "Comfort Cars");

        // Info about cars
        System.out.println("Produced Sports Car: " + sportsCar.model);
        System.out.println("Produced Truck: " + truck.model);
        System.out.println("Produced Sedan: " + sedan.model);
    }
}