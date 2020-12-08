package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private int numberOfGroup;
    private Date admission;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public Date getAdmission() {
        return admission;
    }

    public void setAdmission(Date admission) {
        this.admission = admission;
    }
}
