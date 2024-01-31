package com.teachmeskills.lesson8_hw.task1.doctor.impl;

import com.teachmeskills.lesson8_hw.task1.doctor.BaseDoctor;
import com.teachmeskills.lesson8_hw.task1.factory.DoctorFactory;
import com.teachmeskills.lesson8_hw.task1.patient.Patient;

public class Therapist extends BaseDoctor {

    public Therapist() {
        super("Therapist");
    }

    @Override
    public void treat(Patient patient) {
        System.out.println(String.format("'%s' is treating the patient '%s'", getPosition(), patient.getName()));
    }

    public BaseDoctor setDoctor(Patient patient) {
        BaseDoctor baseDoctor = DoctorFactory.setDoctor(patient);
        patient.setDoctor(baseDoctor);
        return baseDoctor;
    }

}
