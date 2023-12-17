package lesson2;

import java.util.Scanner;

public class Construction4 {
    public static void main(String[] args) {
        System.out.println("Какая температура на улице?");
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        if (temperature > -5) {
            System.out.println("Тепло");
        }
        if (temperature <= -5 && temperature > -20) {
            System.out.println("Нормально");
        }
        if (temperature <= -20) {
            System.out.println("Холодно");
        }
    }
}
