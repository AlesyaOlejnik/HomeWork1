package lesson2;

import java.util.Scanner;

public class Construction1 {
    public static void main(String[] args) {
        System.out.println("Напишите номер месяца");
        Scanner sc = new Scanner(System.in);
        int monthsOfTheYear = sc.nextInt();
        switch (monthsOfTheYear) {
            case 12:
            case 1:
            case 2:
                System.out.println("Пора года зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Пора года весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Пора года лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Пора года осень");
                break;
            default:
                System.out.println("Неизвестная пора года");
        }
    }
}