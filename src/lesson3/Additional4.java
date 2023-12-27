package lesson3;

import java.util.Random;
import java.util.Scanner;

public class Additional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int length;

        while (true) {
            System.out.println("Введите длину массива");
            length = sc.nextInt();
            if (length > 5 && length <= 10) {
                break;
            }
            System.out.println("Длина массива не удовлетворяют условию");
        }

        int[] mas = new int[length];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt();
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int counter = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                counter++;
            }
        }

        if (counter > 0) {
            int[] mas2 = new int[counter];
            int j = 0;
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] % 2 == 0) {
                    mas2[j] = mas[i];
                    System.out.print(mas2[j] + " ");
                    j++;
                }
            }
        } else {
            System.out.println("В первом массиве нет чётных эллементов");
        }
    }
}
