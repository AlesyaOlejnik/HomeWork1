package lesson2;

import java.util.Scanner;

public class AddictionalTask2 {
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада");
        Scanner sc = new Scanner(System.in);
        float sum = sc.nextFloat();
        System.out.println("Введите количество месяцев");
        int numberOfMonths = sc.nextInt();

        for (int i = 0; i < numberOfMonths; i++) {
            sum = sum * 1.07f;

        }
        System.out.println("Сумма вклада с процентами равна " + sum);

    }
}
