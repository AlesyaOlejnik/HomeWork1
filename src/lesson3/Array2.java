package lesson3;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length;

        while (true) {
            length = sc.nextInt();
            if (length > 0) {
                break;
            }
            System.out.println("Длина массива должна быть больше 0");
        }

        double[] mas = new double[length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random();
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        double min = mas[0];
        double max = mas[0];
        double medium = 0;
        for (int i = 0; i < mas.length; i++) {
            min = Math.min(mas[i], min);
            max = Math.max(mas[i], min);
            medium += mas[i];
        }
        System.out.println("Минимальное значение в массиве равно " + min);
        System.out.println("Максимальное значение в массиве равно " + max);
        System.out.println("Среднее значение равно " + medium / length);
    }
}
