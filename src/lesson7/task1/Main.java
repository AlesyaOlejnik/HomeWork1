package lesson7.task1;

import lesson7.task1.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(2112233, "15 Pro", 170);
        Phone phone2 = new Phone(2223334, "15 Pro Max", 200);
        Phone phone3 = new Phone(5555333, "15 Plus", 201);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Иван");
        phone2.receiveCall("Вася");
        phone3.receiveCall("Петя");

        phone1.receiveCall("Аня",444455);
        phone2.receiveCall("Света",1234455);
        phone3.receiveCall("Коля",6785423);

        phone1.sendMessage(444455,6785423,4444444);
    }
}
