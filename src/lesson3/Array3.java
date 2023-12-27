package lesson3;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 2, 3, 4, 5};
        int[] mas2 = new int[]{3, 4, 5, 6, 7};
        int sum1 = 0;
        for (int i = 0; i < mas.length; i++) {
            sum1 += mas[i];
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int sum2 = 0;
        for (int i = 0; i < mas2.length; i++) {
            sum2 += mas2[i];
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        System.out.println("Среднее арифметическое  первого массива равно " + sum1 / mas.length);
        System.out.println("Среднее арифметическое второго массива равно " + sum2 / mas2.length);

        if (sum1 > sum2) {
            System.out.println("Среднее арифметическое первого массива больше");
        }
        if (sum2 > sum1) {
            System.out.println("Среднее арифметическое второго массива больше");
        }
        if (sum1 == sum2) {
            System.out.println("Средние арифметические равны");
        }
    }
}

