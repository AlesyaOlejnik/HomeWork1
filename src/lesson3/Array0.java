package lesson3;

import java.util.Scanner;

public class Array0 {
    public static void main(String[] args) {
        System.out.println("Введите число для поиска");
        Scanner sc = new Scanner(System.in);
        int numberToFind = sc.nextInt();
        int[] mas = new int[]{1, 3, 5, 7, 10, 11, 13, 15, 63, 23};
        for (int i = 0; i < mas.length; i++) {
            if (numberToFind == mas[i]) {
                System.out.println("Заданное число входит в массив");
                return;
            }
        }
        System.out.println("Заданное число не входит в массив");
    }
}