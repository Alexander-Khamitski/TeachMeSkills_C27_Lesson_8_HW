package com.teachmeskills.lesson8_hw.task1.doctor.impl;

import com.teachmeskills.lesson8_hw.task1.doctor.BaseDoctor;
import com.teachmeskills.lesson8_hw.task1.patient.Patient;

public class Dentist extends BaseDoctor {

    public Dentist() {
        super("Dentist");
    }

    @Override
    public void treat(Patient patient) {
        System.out.println(String.format("'%s' is treating the patient '%s'", getPosition(), patient.getName()));
    }

}
