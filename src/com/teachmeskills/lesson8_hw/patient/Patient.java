package com.teachmeskills.lesson8_hw.patient;

import com.teachmeskills.lesson8_hw.doctor.Doctor;

public class Patient {

    private String name;
    private int treatmentPlan;
    private Doctor doctor;

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
        return doctor.getPosition();
    }

    public void setDoctor(Doctor doctor) {
        System.out.println(String.format("'%s' has been assigned to the patient: '%s'", doctor.getPosition(), name));
        this.doctor = doctor;
    }

    public void getPatientInfo() {
        System.out.print("Patient info: ");
        System.out.println("Name: " + name + "; Treatment plan: " + treatmentPlan + "; Doctor: " + getDoctorPosition());
    }
}
