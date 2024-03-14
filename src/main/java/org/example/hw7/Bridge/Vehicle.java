package org.example.hw7.Bridge;

import org.example.hw7.Bridge.Engine;

abstract class Vehicle {
    protected Engine engine;

    protected Vehicle(Engine engine) {
        this.engine = engine;
    }

    public abstract void drive();
}
