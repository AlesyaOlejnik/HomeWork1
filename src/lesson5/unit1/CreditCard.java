package lesson5.unit1;

public class CreditCard {
    Integer cardNumber;
    Integer currentSum;

    CreditCard(Integer cardNumber, Integer currentSum) {
        this.cardNumber = cardNumber;
        this.currentSum = currentSum;
    }

    void addMoney(Integer money) {
        currentSum += money;
    }

    void removeMoney(Integer money) {
        currentSum -= money;
    }

    void info() {
        System.out.println("Номер вашей карты " + cardNumber + ". Текущая сумма на счету " + currentSum);
    }

    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(1, 222);
        CreditCard creditCard2 = new CreditCard(2, 333);
        CreditCard creditCard3 = new CreditCard(3, 444);

        creditCard1.addMoney(4);
        creditCard2.addMoney(5);
        creditCard3.removeMoney(1);

        creditCard1.info();
        creditCard2.info();
        creditCard3.info();
    }
}
