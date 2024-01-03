package lesson4;

public class Additional3 {
    public static void main(String[] args) {
        int[][] mas = {{1, 2, 3}, {4, 5, 6}};
        int sum = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                sum += mas[i][j];
            }
        }
        System.out.println("Сумма всех элементов равна " + sum);
    }
}
