package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student first = new Student();
        first.setName("Kirill");
        first.setSurname("Vasin");
        first.setPatronymic("Nicolaevich");
        first.setNumberOfGroup(1);
        first.setAdmission(new Date());
        System.out.println("Student: " + first.getName() + " " + first.getSurname() + " " +
                first.getPatronymic() + ". Group: " + first.getNumberOfGroup() +
                ". Date admission: " + first.getAdmission() + ".");
    }
}
