package ru.job4j.structure;

public class Surgeon extends Doctor {
    private String workNickname;
    private int countOperation;

    public Surgeon(int experienceYears, int hoursWorkDay, String workNickname, int countOperation) {
        super(experienceYears, hoursWorkDay);
        this.workNickname = workNickname;
        this.countOperation = countOperation;
    }

    public void operate() {

    }

    public String getWorkNickname() {
        return workNickname;
    }

    public int getCountOperation() {
        return countOperation;
    }

    public void setWorkNickname(String workNickname) {
        this.workNickname = workNickname;
    }

    public void setCountOperation(int countOperation) {
        this.countOperation = countOperation;
    }
}
