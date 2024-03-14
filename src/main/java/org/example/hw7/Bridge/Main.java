package org.example.hw7.Bridge;

public class Main {
    public static void main(String[] args) {
        Engine gasolineEngine = new GasolineEngine();
        Engine electricEngine = new ElectricEngine();

        Vehicle car = new Car(gasolineEngine);
        Vehicle bicycle = new Bicycle(electricEngine);

        car.drive();
        bicycle.drive();
    }
}
