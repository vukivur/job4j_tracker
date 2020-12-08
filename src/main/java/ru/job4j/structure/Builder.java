package ru.job4j.structure;

public class Builder extends Engineer {
    private boolean canTractorDrive;
    private String[] skills;

    public boolean isCanTractorDrive() {
        return canTractorDrive;
    }

    public void build() {

    }

    public String[] getSkills() {
        return skills;
    }

    public void setCanTractorDrive(boolean canTractorDrive) {
        this.canTractorDrive = canTractorDrive;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }
}
