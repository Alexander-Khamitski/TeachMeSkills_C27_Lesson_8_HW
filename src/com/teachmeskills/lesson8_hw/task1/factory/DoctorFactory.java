package com.teachmeskills.lesson8_hw.task1.factory;

import com.teachmeskills.lesson8_hw.task1.doctor.BaseDoctor;
import com.teachmeskills.lesson8_hw.task1.doctor.impl.Dentist;
import com.teachmeskills.lesson8_hw.task1.doctor.impl.Surgeon;
import com.teachmeskills.lesson8_hw.task1.doctor.impl.Therapist;
import com.teachmeskills.lesson8_hw.task1.patient.Patient;

public class DoctorFactory {

    public static BaseDoctor setDoctor(Patient patient) {
        if (patient.getTreatmentPlan() == 1) {
            return new Surgeon();
        } else if (patient.getTreatmentPlan() == 2) {
            return new Dentist();
        } else {
            return new Therapist();
        }
    }

}
