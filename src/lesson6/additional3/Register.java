package lesson6.additional3;

public class Register {
    private Document[] documents = new Document[10];
    private int documentCount = 0;

    public void addDocument(Document document) {
        if (documentCount > 9) {
            System.out.println("Регистр полон");
            return;
        }
        documents[documentCount++] = document;
    }

    public void printDocumentInfo(Document document){
        System.out.println(document);
    }
}
