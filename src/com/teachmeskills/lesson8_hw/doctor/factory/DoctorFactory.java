package com.teachmeskills.lesson8_hw.doctor.factory;

import com.teachmeskills.lesson8_hw.doctor.Doctor;
import com.teachmeskills.lesson8_hw.doctor.impl.Dentist;
import com.teachmeskills.lesson8_hw.doctor.impl.Surgeon;
import com.teachmeskills.lesson8_hw.doctor.impl.Therapist;
import com.teachmeskills.lesson8_hw.patient.Patient;

public class DoctorFactory {

    public static Doctor setDoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            return new Surgeon();
        } else if (patient.getTreatmentPlan() == 2) {
            return new Dentist();
        } else {
            return new Therapist();
        }
    }

}
