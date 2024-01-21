package lesson7.task2;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        TreatmentPlan treatmentPlan = new TreatmentPlan(2);
        patient.setTreatmentPlan(treatmentPlan);
        Dentist dentist = new Dentist();
        Surgeon surgeon = new Surgeon();
        Therapist therapist = new Therapist();
        Clinic clinic = new Clinic(dentist,therapist,surgeon);
        clinic.contactClinic(patient);
    }
}
