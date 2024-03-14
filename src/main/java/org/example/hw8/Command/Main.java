package org.example.hw8.Command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Настройка кнопок пульта управления
        remoteControl.setCommand(lightOn); // Установить команду включения света
        remoteControl.pressButton(); // Нажать на кнопку для включения света

        remoteControl.setCommand(lightOff); // Установить команду выключения света
        remoteControl.pressButton(); // Нажать на кнопку для выключения света
    }
}
