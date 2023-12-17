package lesson2;

import java.util.Scanner;

public class Cycle3 {
    public static void main(String[] args) {
        System.out.println("Введите любое целое положительное число");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисел равна " + sum);
    }
}
