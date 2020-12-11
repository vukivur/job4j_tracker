package ru.job4j.oop;

public class TransportUsage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{plane, train, bus};
        for(Vehicle transport : vehicles) {
            transport.move();
        }
        System.out.println();
        for (Vehicle transport : vehicles) {
            transport.stop();
        }
    }
}
