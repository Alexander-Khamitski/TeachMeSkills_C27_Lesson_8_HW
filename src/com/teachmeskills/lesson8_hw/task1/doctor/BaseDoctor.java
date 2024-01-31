package com.teachmeskills.lesson8_hw.task1.doctor;

public abstract class BaseDoctor implements ITreat {

    private String position;

    public BaseDoctor(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}
