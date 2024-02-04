package lesson10.task5;

public class Duplication {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.replaceAll(".", "$0$0"));
    }
}
