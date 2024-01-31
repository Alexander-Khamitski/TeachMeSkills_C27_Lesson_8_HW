package com.teachmeskills.lesson8_hw.task1.run;

import com.teachmeskills.lesson8_hw.task1.doctor.BaseDoctor;
import com.teachmeskills.lesson8_hw.task1.doctor.impl.Therapist;
import com.teachmeskills.lesson8_hw.task1.patient.Patient;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Hello!");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient name: ");
        Patient patient = new Patient(scanner.nextLine());
        System.out.println("Enter treatment plan code (1 - Surgery, 2 - Dentistry, 3 - Therapy): ");
        patient.setTreatmentPlan(scanner.nextInt());
        scanner.close();
        Therapist therapist = new Therapist();
        BaseDoctor baseDoctor = therapist.setDoctor(patient);
        baseDoctor.treat(patient);
        patient.getPatientInfo();
    }

}
