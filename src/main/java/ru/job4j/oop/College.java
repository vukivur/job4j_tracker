package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        Freshman freshman = new Freshman();
        Student sf = freshman;
        Object of = freshman;
        Freshman freshFromObject = (Freshman) of;
        Object ofNew = new Freshman();
    }
}
