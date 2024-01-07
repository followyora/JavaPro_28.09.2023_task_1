package org.example;

import org.example.cars.Automobile;

import static org.example.factory.Factory.*;

public class Main {
    public static void main(String[] args) {
        // Создаём обьект
        Automobile myCar = new Automobile();

        //Значения для полей
        myCar.type = Automobile.CarType.SPORTS_CAR;
        // В другом пакете, нет доступа myCar.model = "NONE"
        myCar.setEnginePower(500);
        myCar.setBrand("NoneBrand");

        //Выводим инфо о машине
        System.out.println("Type: " + myCar.type);
        System.out.println("Model: НЕТ ДОСТУПА, НАХОДИТЬСЯ В ДРУГОМ ПАКЕТЕ ");
        System.out.println("Engine power : " + myCar.getEnginePower() + "HP");
        System.out.println("Brand: " + myCar.getBrand());

        System.out.println("******************");
        System.out.println("******************");
        System.out.println("******************");

        // Пример использования фабрики для создания автомобилей
        Automobile sportsCar = produceSportsCar(" Sport", 400, "Speed Motors");
        Automobile truck = produceTruck("Big Hauler", 500, "Heavy Trucks");
        Automobile sedan = produceSedan("Family Car", 200, "Comfort Cars");

        // Выводим информацию о созданных автомобилях
        System.out.println("Produced Sports Car: " + sportsCar.model);
        System.out.println("Produced Truck: " + truck.model);
        System.out.println("Produced Sedan: " + sedan.model);
    }
}