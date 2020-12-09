package ru.job4j.structure;

public class Dentist extends Doctor {
    private int teethCollection;
    private int countPatient;

    public Dentist(int teethCollection, int countPatient, int experienceYears, int hoursWorkDay) {
        this.teethCollection = teethCollection;
        this.countPatient = countPatient;
        super.setExperienceYears(experienceYears);
        super.setHoursWorkDay(hoursWorkDay);
    }

    public void healTeeth() {

    }

    public void makeAnesthesia() {

    }

    public int getTeethCollection() {
        return teethCollection;
    }

    public int getCountPatient() {
        return countPatient;
    }

    public void setTeethCollection(int teethCollection) {
        this.teethCollection = teethCollection;
    }

    public void setCountPatient(int countPatient) {
        this.countPatient = countPatient;
    }
}
