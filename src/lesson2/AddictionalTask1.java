package lesson2;

public class AddictionalTask1 {
    public static void main(String[] args) {
        int current = 1;
        int previous = 1;
        System.out.print(current + " " + previous + " ");
        for (int i = 1; i < 9; i++) {
            int fib = current + previous;
            previous = current;
            current = fib;
            System.out.print(fib + " ");
        }
    }
}
