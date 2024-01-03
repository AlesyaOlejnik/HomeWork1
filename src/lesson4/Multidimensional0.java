package lesson4;

import java.util.Random;
import java.util.Scanner;

public class Multidimensional0 {
    public static void main(String[] args) {
        System.out.println("Введите число ,на которое будет увеличиваться элемент");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        Random random = new Random();
        int[][][] mas = new int[2][2][2];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < mas[i][j].length; k++) {
                    mas[i][j][k] = random.nextInt(10);
                    System.out.print(mas[i][j][k] + " ");
                }
            }
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                for (int k = 0; k < mas[i][j].length; k++) {
                    mas[i][j][k] = mas [i][j][k] + number;
                    System.out.print(mas[i][j][k] + " ");
                }
            }

        }
    }
}
