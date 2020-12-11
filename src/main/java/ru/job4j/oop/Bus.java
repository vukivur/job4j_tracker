package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + ": Автобус тронулся.");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + ": Aвтобус остановился.");
    }
}
