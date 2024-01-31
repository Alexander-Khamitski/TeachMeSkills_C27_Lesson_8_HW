package com.teachmeskills.lesson8_hw.task1.patient;

import com.teachmeskills.lesson8_hw.task1.doctor.BaseDoctor;

public class Patient {

    private String name;
    private int treatmentPlan;
    private BaseDoctor baseDoctor;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        if (treatmentPlan == 1 || treatmentPlan == 2 || treatmentPlan == 3) {
            this.treatmentPlan = treatmentPlan;
        } else {
            throw new IllegalArgumentException("Invalid treatment plan: " + treatmentPlan);
        }

    }

    public String getDoctorPosition() {
        return baseDoctor.getPosition();
    }

    public void setDoctor(BaseDoctor baseDoctor) {
        System.out.println(String.format("'%s' has been assigned to the patient: '%s'", baseDoctor.getPosition(), name));
        this.baseDoctor = baseDoctor;
    }

    public void getPatientInfo() {
        System.out.print("Patient info: ");
        System.out.println(String.format("Name: '%s'; Treatment plan: '%s'; Doctor: '%s';", name, treatmentPlan, getDoctorPosition()));
    }
}
