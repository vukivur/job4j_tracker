package ru.job4j.structure;

public class Doctor extends Profession {
    private int experienceYears;
    private int hoursWorkDay;

    public Doctor(int experienceYears, int hoursWorkDay) {
        this.experienceYears = experienceYears;
        this.hoursWorkDay = hoursWorkDay;
    }

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
