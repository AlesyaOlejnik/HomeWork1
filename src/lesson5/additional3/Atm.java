package lesson5.additional3;

public class Atm {
    Integer amount20;
    Integer amount50;
    Integer amount100;

    Atm(Integer amount20, Integer amount50, Integer amount100) {
        this.amount20 = amount20;
        this.amount50 = amount50;
        this.amount100 = amount100;
    }

    void addMoney(Integer amount20, Integer amount50, Integer amount100) {
        this.amount20 += amount20;
        this.amount50 += amount50;
        this.amount100 += amount100;
    }

    boolean removeMoney(Integer sum) {
        int count20 = 0;
        int count50 = 0;
        int count100 = 0;
        int atmSum = amount20 * 20 + amount50 * 50 + amount100 * 100;

        if (sum % 10 != 0 || sum > atmSum) {
            return false;
        }
        if (atmSum == sum) {
            return true;
        }

        if (sum >= 100 && amount100 > 0) {
            int need100;
            if (sum / 10 % 2 != 0 && sum / 10 % 10 < 6) {
                need100 = sum / 100 - 1;
            } else {
                need100 = sum / 100;
            }
            if (need100 <= amount100) {
                count100 = need100;
            } else {
                count100 = amount100;
            }
            amount100 -= count100;
            sum = sum - count100 * 100;
        }

        if (sum >= 50 && amount50 > 0) {
            int need50 = sum / 50;
            if (sum / 10 % 2 != 0) {
                if (need50 % 2 == 0) {
                    need50 -= 1;
                }
            } else {
                if (need50 % 2 != 0) {
                    need50 -= 1;
                }
            }
            if (need50 <= amount50) {
                count50 = need50;
            } else {
                if (sum / 10 % 2 != 0) {
                    if (amount50 % 2 == 0) {
                        count50 = amount50 - 1;
                    } else {
                        count50 = amount50;
                    }
                } else {
                    if (amount50 % 2 != 0) {
                        count50 = amount50 - 1;
                    } else {
                        count50 = amount50;
                    }
                }
            }
            amount50 -= count50;
            sum = sum - count50 * 50;
        }

        if (sum >= 20 && amount20 > 0) {
            int need20 = sum / 20;
            if (need20 <= amount20) {
                count20 = need20;
            } else {
                count20 = amount20;
            }
            amount20 -= count20;
            sum = sum - count20 * 20;
        }

        if (sum == 0) {
            System.out.println("Количество выданных купюр по 100 - " + count100);
            System.out.println("Количество выданных купюр по 50 - " + count50);
            System.out.println("Количество выданных купюр по 20 - " + count20);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Atm atm = new Atm(6, 1, 2);
        atm.addMoney(0, 0, 0);
        System.out.println(atm.removeMoney(230));
    }

}
