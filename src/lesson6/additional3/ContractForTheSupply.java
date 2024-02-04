package lesson6.additional3;

import java.util.Date;

public class ContractForTheSupply extends Document {
    private String type;
    private int amount;

    public ContractForTheSupply() {

    }

    public ContractForTheSupply(String documentNumber, Date date, String type, int amount) {
        super(documentNumber, date);
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ContractForTheSupply{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", documentNumber=" + documentNumber +
                ", date=" + date +
                '}';
    }
}
