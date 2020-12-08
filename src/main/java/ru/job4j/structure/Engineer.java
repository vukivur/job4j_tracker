package ru.job4j.structure;

public class Engineer extends Profession {
    private String[] instruments;
    private int practiceYears;

    public void create() {

    }

    public void setInstruments(String[] instruments) {
        this.instruments = instruments;
    }

    public void setPracticeYears(int practiceYears) {
        this.practiceYears = practiceYears;
    }

    public String[] getInstruments() {
        return instruments;
    }

    public int getPracticeYears() {
        return practiceYears;
    }
}
