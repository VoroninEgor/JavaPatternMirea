package org.example.hw5;

public class SecondSingleton {

    private SecondSingleton() {}

    private class InstanceHolder {
        private static final SecondSingleton instance = new SecondSingleton();
    }

    public static SecondSingleton getInstance() {
        return InstanceHolder.instance;
    }
}
