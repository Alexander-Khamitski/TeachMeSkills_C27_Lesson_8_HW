# TeachMeSkills_C27_Lesson_7_HW
Homework for the seventh lesson

1. **Task #1**

Interface "Itreat" contains method treat().
Abstract class "BaseDoctor" contains field position, constructor and getPosition() method;

There are three "BaseDoctor" subclasses: Dentist, Surgeon, Therapist. 
All of them contain parent class constructor with specific name, overriden method thread().
Class "Therapist" contains method setDoctor(Patient patient). This method use DoctorFactory.setDoctor(patient) method 
which is implemented in DoctorFactory class. 

Class "Patient" contains: 
- fields: name, treatmentPlan, baseDoctor;
- methods: getName(), getTreatmentPlan(), setTreatmentPlan(int treatmentPlan) with validation assertion, 
  getDoctorPosition(), setDoctor(BaseDoctor baseDoctor) and getPatientInfo() methods;

"Runner" class contains clinic logic:
- create and set patient name;
- set treatment plan;
- treat patient;
- get patient info;

