package lesson5.additional2;

public class Computer {
    Integer price;
    String model;
    RAM ram;
    HDD hdd;

    Computer(Integer price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();
    }

    Computer(Integer price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    void info() {
        System.out.println("Цена компьютера = " + price + ".Модель компьютера = " + model);
        ram.info();
        hdd.info();
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer(10, "Acer");
        RAM ram = new RAM("DDR4", 16);
        HDD hdd = new HDD("SEAGATE", 1024, "Внутренний");
        Computer computer2 = new Computer(20, "Lenovo", ram, hdd);
        computer1.info();
        computer2.info();
    }

}
