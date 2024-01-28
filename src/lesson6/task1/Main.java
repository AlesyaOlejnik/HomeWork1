package lesson6.task1;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Rectangle(2, 3),
                new Circle(2),
                new Triangle(1, 2, 3),
                new Circle(7),
                new Triangle(4, 5, 6),};

        double sum = 0;
        for (int i = 0; i < figures.length; i++) {
            sum += figures[i].getPerimeter();
        }
        System.out.println("Сумма периметра всех фигур  в массиве = " + sum);
    }
}
