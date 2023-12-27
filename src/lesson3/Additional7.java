package lesson3;

public class Additional7 {
    public static void main(String[] args) {
        int[] mas = new int[]{10, 8, 23, 2, 45};
        for (int i = 0; i < mas.length; i++) {
            for (int j = i; j < mas.length; j++) {
                if (mas[i] > mas[j]) {
                    int temp = mas[i];
                    mas[i] = mas[j];
                    mas[j] = temp;
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }
}

