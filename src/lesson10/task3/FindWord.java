package lesson10.task3;

import java.util.HashSet;
import java.util.Set;

public class FindWord {
    public static void findWord(String sentence) {
        String findedWord = "";
        int difSymCount = Integer.MAX_VALUE;

        String[] words = sentence.split(" ");
        for (String word : words) {
            Set<Character> characters = new HashSet<>();
            char[] charArray = word.toCharArray();
            for (char c : charArray) {
                characters.add(c);
            }
            if (characters.size() < difSymCount) {
                difSymCount = characters.size();
                findedWord = word;
            }
        }

        System.out.println("Слово с наименьшим количеством разных символов - " + findedWord);
    }
}
