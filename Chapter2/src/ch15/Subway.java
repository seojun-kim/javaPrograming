package ch15;

public class Subway {

    String subwayColor;
    int passengerCount;
    int money;

    public Subway(String subwayColor) {

        this.subwayColor = subwayColor;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showSubwayInfo() {

        System.out.printf("%s색 지하철의 이익 %d, 승객 수 %d\n", subwayColor, money, passengerCount);
    }
}
