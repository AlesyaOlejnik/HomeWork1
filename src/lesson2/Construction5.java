package lesson2;

import java.util.Scanner;

public class Construction5 {
    public static void main(String[] args) {
        System.out.println("Введите номер цвета");
        Scanner sc = new Scanner(System.in);
        int numberOfColour = sc.nextInt();
        switch (numberOfColour) {
            case 1:
                System.out.println("Цвет красный");
                break;
            case 2:
                System.out.println("Цвет оранжевый");
                break;
            case 3:
                System.out.println("Цвет желтый");
                break;
            case 4:
                System.out.println("Цвет зеленый");
                break;
            case 5:
                System.out.println("Цвет голубой");
                break;
            case 6:
                System.out.println("Цвет синий");
                break;
            case 7:
                System.out.println("Цвет фиолетовый");
            default:
                System.out.println("В радуге 7 цветов");
        }
    }
}
