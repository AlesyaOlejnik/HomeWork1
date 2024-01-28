package lesson6.additional3;

import java.util.Date;

public class FinancialInvoice extends Document {
    private int sum;
    private int code;

    public FinancialInvoice() {
    }


    public FinancialInvoice(int documentNumber, Date date, int sum, int code) {
        super(documentNumber, date);
        this.sum = sum;
        this.code = code;
    }

    @Override
    public String toString() {
        return "FinancialInvoice{" +
                "sum=" + sum +
                ", code=" + code +
                ", documentNumber=" + documentNumber +
                ", date=" + date +
                '}';
    }
}
