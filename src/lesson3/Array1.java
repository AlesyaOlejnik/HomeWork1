package lesson3;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число, которое вы хотите удалить из массива");
        int toDelete = sc.nextInt();
        int counter = 0;
        int[] mas = new int[]{10, 9, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < mas.length; i++) {
            if (toDelete == mas[i]) {
                mas[i] = -1;
                counter++;
            }

        }

        if (counter == 0) {
            System.out.println("Такого числа нет");
        } else {
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
        }
    }
}