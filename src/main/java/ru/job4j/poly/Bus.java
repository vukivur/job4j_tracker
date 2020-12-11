package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Bus is driving.");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("Passengers: " + passengers);
    }

    @Override
    public int fillUp(int liters) {
        return liters * 10;
    }
}
