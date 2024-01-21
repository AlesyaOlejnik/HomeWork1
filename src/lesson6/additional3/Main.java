package lesson6.additional3;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Document document1 = new ContractForTheSupply(1, new Date(12345), "contract", 20);
        Document document2 = new EmployeeContract(2, new Date(1123), "Ivan", new Date(1124));
        Document document3 = new FinancialInvoice(3,new Date(1122),56789,222);
        Register register = new Register();
        register.addDocument(document1);
        register.addDocument(document2);
        register.addDocument(document3);
        register.printDocumentInfo(document1);
        register.printDocumentInfo(document2);
        register.printDocumentInfo(document3);
    }

}
