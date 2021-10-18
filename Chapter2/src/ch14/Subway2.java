package ch14;

public class Subway2 {

    String subwayColor;
    int passengerCount;
    int money;

    public Subway2(String subwayColor) {

        this.subwayColor = subwayColor;
    }

    public void take(int money) {

        this.money += 1000;
        passengerCount++;
    }

    public void showBusInfo() {

        System.out.printf("%d번의 승객 수는 %d, 수익 %d원", subwayColor, passengerCount, money);
    }
}
