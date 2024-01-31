package com.teachmeskills.lesson8_hw.doctor.impl;

import com.teachmeskills.lesson8_hw.doctor.Doctor;
import com.teachmeskills.lesson8_hw.patient.Patient;

public class Dentist extends Doctor {

    public Dentist() {
        super("Dentist");
    }

    @Override
    public void treat(Patient patient) {
        System.out.println(String.format("'%s' is treating the patient '%s'", getPosition(), patient.getName()));
    }

}
