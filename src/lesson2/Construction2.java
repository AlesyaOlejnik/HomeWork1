package lesson2;

import java.util.Scanner;

public class Construction2 {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца");
        Scanner sc = new Scanner(System.in);
        int monthsOfTheYear = sc.nextInt();
        if (monthsOfTheYear == 12 || monthsOfTheYear == 1 || monthsOfTheYear == 2) {
            System.out.println("Пора года зима");
        }
        if (monthsOfTheYear == 3 || monthsOfTheYear == 4 || monthsOfTheYear == 5) {
            System.out.println("Пора года весна");
        }
        if (monthsOfTheYear == 6 || monthsOfTheYear == 7 || monthsOfTheYear == 8) {
            System.out.println("Пора года весна");
        }
        if (monthsOfTheYear == 9 || monthsOfTheYear == 10 || monthsOfTheYear == 11) {
            System.out.println("Пора года осень");
        }
    }

}

