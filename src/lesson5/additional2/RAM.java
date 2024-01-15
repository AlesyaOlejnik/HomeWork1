package lesson5.additional2;

public class RAM {
    String name;
    Integer volume;

    RAM(){}

    RAM(String name, Integer volume){
        this.name = name;
        this.volume = volume;
    }

    void info(){
        System.out.println("Модель RAM = " + name + ". Объем памяти = " + volume ) ;
    }
}
