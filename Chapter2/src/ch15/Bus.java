package ch15;

public class Bus {

    int busNumber;
    int passengerCount;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.printf("%d 버스의 이익 %d, 승객 수 %d\n", busNumber, money, passengerCount);
    }
}
