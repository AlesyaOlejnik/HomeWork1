package lesson7.task1;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, int callerNumber) {
        System.out.println("Звонит " + callerName + " Номер телефона звонящего " + callerNumber);
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public int getWeight() {
        return weight;
    }

    public void sendMessage(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    @Override
    public String toString() {
        return "Модель телефон - " + model +
                "\n номер телефона - " + number +
                "\n вес телефона - " + weight;
    }
}
