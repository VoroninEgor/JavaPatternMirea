package org.example.hw7.Bridge;

import org.example.hw7.Bridge.Engine;

public class GasolineEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Starting gasoline engine...");
    }
}
