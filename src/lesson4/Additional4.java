package lesson4;

public class Additional4 {
    public static void main(String[] args) {
        int[][] mas = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Основная диагональ:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i][i] + " ");
        }
        System.out.println();
        System.out.println("Побочная диагональ");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i][mas.length - 1 - i] + " ");
        }
    }
}
