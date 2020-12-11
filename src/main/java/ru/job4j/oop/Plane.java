package ru.job4j.oop;

public class Plane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + ": Самолет взлетает.");
    }

    @Override
    public void stop() {
        System.out.println(getClass().getSimpleName() + ": Самолет идет на посадку.");
    }
}
