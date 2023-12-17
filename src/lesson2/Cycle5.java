package lesson2;

public class Cycle5 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(sum + " ");
            sum = sum - 5;
        }
    }
}
