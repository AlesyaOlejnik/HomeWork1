package lesson1;

import java.util.Scanner;

public class Unit1Task1 {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello , " + name);
    }

}

