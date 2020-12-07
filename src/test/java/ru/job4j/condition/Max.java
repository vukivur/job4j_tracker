package ru.job4j.condition;

public class Max {

    public static double add(double first, double second) {
        return first > second ? first : second;
    }

    public static double add(double first, double second, double third) {
        return add(first, second) > third ? add(first, second) : third;
    }

    public static double add(double first, double second, double third, double fourth) {
        return add(first, second, third) > fourth ? add(first, second, third) : fourth;
    }
}
