package com.teachmeskills.lesson8_hw.doctor.impl;

import com.teachmeskills.lesson8_hw.doctor.Doctor;
import com.teachmeskills.lesson8_hw.doctor.factory.DoctorFactory;
import com.teachmeskills.lesson8_hw.patient.Patient;

public class Therapist extends Doctor {

    public Therapist() {
        super("Therapist");
    }

    @Override
    public void treat(Patient patient) {
        System.out.println(String.format("'%s' is treating the patient '%s'", getPosition(), patient.getName()));
    }

    public Doctor setDoctor(Patient patient) {
        Doctor doctor = DoctorFactory.setDoctor(patient);
        patient.setDoctor(doctor);
        return doctor;
    }

}
