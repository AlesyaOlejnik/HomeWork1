package lesson6.additional3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Document document1 = null;
        Document document2 = null;
        Document document3 = null;

        try {
            document1 = new ContractForTheSupply("554", new Date(12345), "contract", 20);
        } catch (NotStartWith555Exception exception) {
            System.out.println("Номер документа не начинается с последовательности 555");
        }

        try {
            document2 = new EmployeeContract("555ab", new Date(1123), "Ivan", new Date(1124));
        } catch (NotContainsAbcException exception) {
            System.out.println("Номер документа не содержит последовательность abc");
        }

        try {
            document3 = new FinancialInvoice("5551abc", new Date(1122), 56789, 222);
        } catch (NotEndsWith1a2bException exception) {
            System.out.println("Номер документа не заканчивается на последовательность 1a2b");
        }

        Register register = new Register();
        register.addDocument(document1);
        register.addDocument(document2);
        register.addDocument(document3);
        register.printDocumentInfo(document1);
        register.printDocumentInfo(document2);
        register.printDocumentInfo(document3);

    }

}
