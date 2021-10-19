package ch15;

public class Taxi {

    String companyName;
    int passengerCount;
    int money;

    public Taxi(String companyName) {
        this.companyName = companyName;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showTaxiInfo() {
        System.out.printf("%s회사 택시의 이익 %d, 승객 수 %d\n", companyName, money, passengerCount);
    }
}
