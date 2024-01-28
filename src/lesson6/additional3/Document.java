package lesson6.additional3;

import java.util.Date;

public abstract class Document {
    protected String documentNumber;
    protected Date date;

    public Document() {
    }

    public Document(String documentNumber, Date date) {
        checkDocumentNumber(documentNumber);
        this.documentNumber = documentNumber;
        this.date = date;
    }

    private void checkDocumentNumber(String documentNumber) throws NotContainsAbcException,NotEndsWith1a2bException,NotStartWith555Exception {
        if (!documentNumber.startsWith("555")) {
            throw new NotStartWith555Exception();
        }
        if (!documentNumber.contains("abc")) {
            throw new NotContainsAbcException();
        }
        if (!documentNumber.endsWith("1a2b")){
            throw new NotEndsWith1a2bException();
        }
    }


}
