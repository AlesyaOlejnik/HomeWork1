package lesson7.task2;

public class Therapist implements Treatable{
    @Override
    public void treat() {
        System.out.println("Лечит терапевт");
    }
}
