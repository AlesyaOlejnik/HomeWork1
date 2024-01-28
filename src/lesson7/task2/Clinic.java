package lesson7.task2;

public class Clinic {
    private Dentist dentist;
    private Therapist therapist;
    private Surgeon surgeon;

    public Clinic(Dentist dentist, Therapist therapist, Surgeon surgeon) {
        this.dentist = dentist;
        this.therapist = therapist;
        this.surgeon = surgeon;
    }

    public void contactClinic(Patient patient) {
        TreatmentPlan treatmentPlan = patient.getTreatmentPlan();
        int code = treatmentPlan.getCode();

        switch (code) {
            case 1:
                surgeon.treat();
                break;
            case 2:
                dentist.treat();
                break;
            default:
                therapist.treat();
        }
    }
}
