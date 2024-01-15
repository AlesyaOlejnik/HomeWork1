package lesson5.additional2;

public class HDD {
    String name;
    Integer volume;
    String type;

    HDD(){}

    HDD(String name, Integer volume, String type){
        this.name = name;
        this.volume = volume;
        this.type =type;
    }
    void info(){
        System.out.println("Модель HDD = " + name + ".Объем памяти = " + volume + ".Тип = " + type);
    }
}
