package lesson6.additional3;

import java.util.Date;

public abstract class Document {
    protected int documentNumber;
    protected Date date;

    public Document() {
    }

    public Document(int documentNumber, Date date) {
        this.documentNumber = documentNumber;
        this.date = date;
    }

}
