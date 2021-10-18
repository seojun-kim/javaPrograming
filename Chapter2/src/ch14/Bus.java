package ch14;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {

        this.money += 1000;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.printf("%d번의 승객 수는 %d, 수익 %d원\n", busNumber, passengerCount, money);
    }
}
