package lesson11;

public class Main {
    public static void main(String[] args) {
        CustomCollection<String> collection = new CustomCollection<>();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        System.out.println(collection.get(0));
        System.out.println(collection.get(1));
        System.out.println(collection.get(2));
        System.out.println(collection.find("3"));
        System.out.println(collection.find("4"));
        System.out.println(collection);
        collection.delete("3");
        System.out.println(collection);
        collection.removeAll();
        System.out.println(collection);
    }
}
