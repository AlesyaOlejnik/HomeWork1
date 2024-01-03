package lesson4;

public class Additional5 {
    public static void main(String[] args) {
        int[][] mas = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                for (int k = j; k < mas.length; k++) {
                    if (mas[i][j] > mas[i][k]) {
                        int temp = mas[i][j];
                        mas[i][j] = mas[i][k];
                        mas[i][k] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
    }
}
