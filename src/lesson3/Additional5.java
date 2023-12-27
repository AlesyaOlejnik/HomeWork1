package lesson3;

public class Additional5 {
    public static void main(String[] args) {
        int[] mas = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }

        System.out.println();
        for (int i = 1; i < mas.length; i += 2) {
            mas[i] = 0;
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}