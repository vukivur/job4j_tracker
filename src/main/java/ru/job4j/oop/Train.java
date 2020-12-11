package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + ": Поезд тронулся.");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + ": Поезд остановился.");
    }
}
