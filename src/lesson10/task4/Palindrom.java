package lesson10.task4;

public class Palindrom {
    public static void isPalindrom(String sentence, int wordNumber) {
        String[] words = sentence.split(" ");
        if (wordNumber > words.length) {
            throw new CustomException("В предложении , которое вы передали количество слов : " + words.length + ". Вы пытались найти слово под номером " + wordNumber);
        }

        String word = words[wordNumber - 1];
        StringBuilder wordToCheck = new StringBuilder(word);
        wordToCheck.reverse();

        if (word.equals(wordToCheck.toString())) {
            System.out.println("Это слово палиндром");
        } else {
            System.out.println("Это слово не палиндром");
        }
    }
}
