package lesson3;

import java.util.Random;

public class Additional6 {
    public static void main(String[] args) {
        String [] mas = new String[]{"Вася","Таня","Лера","Яна","Тоня","Маша","Ира","Леся","Максим","Костя"};
        String [] mas2 = new String[5];

        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = mas[(int)(Math.random()*10)];
        }
        for (int i = 0; i < mas2.length; i++) {
            System.out.print(mas2[i] + " ");

        }
    }
}
