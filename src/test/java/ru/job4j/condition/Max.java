package ru.job4j.condition;

public class Max {

    public static double max(double first, double second) {
        return first > second ? first : second;
    }

    public static double max(double first, double second, double third) {
        return max(max(first, second), third);
    }

    public static double max(double first, double second, double third, double fourth) {
        return max(max(max(first, second), third), fourth);
    }
}
