package com.teachmeskills.lesson8_hw.doctor;

public abstract class Doctor implements ITreat {

    private String position;

    public Doctor(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
