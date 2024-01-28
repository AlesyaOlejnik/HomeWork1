package lesson6.additional3;

import java.util.Date;

public class EmployeeContract extends Document {
    private String name;
    private Date contractEnd;

    public EmployeeContract() {
    }

    public EmployeeContract(int documentNumber, Date date, String name, Date contractEnd) {
        super(documentNumber, date);
        this.name = name;
        this.contractEnd = contractEnd;
    }

    @Override
    public String toString() {
        return "EmployeeContract{" +
                "name='" + name + '\'' +
                ", contractEnd=" + contractEnd +
                ", documentNumber=" + documentNumber +
                ", date=" + date +
                '}';
    }
}
