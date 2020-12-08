package ru.job4j.structure;

public class Doctor extends Profession {
    private int experienceYears;
    private int hoursWorkDay;

    public void callNurse() {

    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public int getHoursWorkDay() {
        return hoursWorkDay;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public void setHoursWorkDay(int hoursWorkDay) {
        this.hoursWorkDay = hoursWorkDay;
    }
}
