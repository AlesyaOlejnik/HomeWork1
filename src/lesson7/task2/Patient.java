package lesson7.task2;

public class Patient {

    private TreatmentPlan treatmentPlan;

    public Patient(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Patient() {
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public TreatmentPlan getTreatmentPlan(){
        return treatmentPlan;
    }
}
