package org.example.hw7.Bridge;


class Bicycle extends Vehicle {
    public Bicycle(Engine engine) {
        super(engine);
    }

    @Override
    public void drive() {
        System.out.println("Riding Bicycle");
        engine.start();
    }
}