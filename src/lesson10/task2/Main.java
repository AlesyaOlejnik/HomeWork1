package lesson10.task2;

public class Main {
    public static void main(String[] args) {
        printMaxAndMinWords("собака кот жираф");
    }

    public static void printMaxAndMinWords(String string) {
        String[] words = string.split(" ");
        String minWord = "";
        int minWordLength = Integer.MAX_VALUE;
        String maxWord = "";
        for (String word : words) {
            if (word.length() >= maxWord.length()) {
                maxWord = word;
            }
            if (word.length() <= minWordLength) {
                minWord = word;
                minWordLength = word.length();
            }
        }
        System.out.println("Максимальное слово - " + maxWord + ". Минимальное слово - " + minWord);
    }
}
