package org.example.hw7.Bridge;


class Car extends Vehicle {
    public Car(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("Driving Car");
        engine.start();
    }
}
