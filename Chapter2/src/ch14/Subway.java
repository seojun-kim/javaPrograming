package ch14;

public class Subway {

    int subwayNumber;
    int passengerCount;
    int money;

    public Subway(int subwayNumber) {

        this.subwayNumber = subwayNumber;
    }

    public void take(int money) {

        this.money += 1200;
        passengerCount++;
    }

    public void showBusInfo() {

        System.out.printf("%d번의 승객 수는 %d, 수익 %d원\n", subwayNumber, passengerCount, money);
    }
}
