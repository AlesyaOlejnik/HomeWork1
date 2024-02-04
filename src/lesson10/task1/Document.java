package lesson10.task1;

public class Document {
    public static void showFirstEightNumbers(String document) {
        String firstPart = document.substring(0, 4);
        String secondPart = document.substring(9, 13);
        System.out.println(firstPart + secondPart);
    }

    public static void showDocumentNumbersWithoutLetters(String document) {
        String docToPrint = document.replaceAll("[a-zA-Z]{3,}", "***");
        System.out.println(docToPrint);
    }

    public static void showDocumentWithoutNumbers(String document) {
        document = document.toLowerCase();
        String firstPart = document.substring(5, 8);
        String secondPart = document.substring(14, 17);
        char thirdPart = document.charAt(19);
        char fourthPart = document.charAt(21);
        System.out.println(firstPart + "/" + secondPart + "/" + thirdPart + "/" + fourthPart);
    }

    public static void showDocumentInUpperCase(String document) {
        document = document.toUpperCase();
        StringBuilder stringBuilder = new StringBuilder(document);
        stringBuilder.replace(0, 5, "");
        stringBuilder.replace(3, 9, "/");
        stringBuilder.replace(7, 9, "/");
        stringBuilder.replace(9, 10, "/");
        stringBuilder.insert(0, "Letters:");
        System.out.println(stringBuilder);
    }

    public static void isContainAbcSequence(String document) {
        document = document.toUpperCase();
        if (document.contains("ABC")) {
            System.out.println("Найдена последовательность");
        } else {
            System.out.println("Последовательность не найдена");
        }
    }

    public static void isStartsWith555(String document) {
        if (document.startsWith("555")) {
            System.out.println("Документ начинается с последовательности 555");
        } else {
            System.out.println("Документ не начинается с последовательности 555");
        }
    }

    public static void isEndsWith1a2b(String document) {
        if (document.endsWith("1a2b")) {
            System.out.println("Документ заканчивается на последовательность 1a2b");
        } else {
            System.out.println("Документ не заканчивается на последовательность 1a2b");
        }
    }
}
