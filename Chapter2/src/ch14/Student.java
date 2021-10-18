package ch14;

public class Student {

    String studentName;
    int money;

    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Bus bus) {
        bus.take(money);
        money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(money);
        money -= 1200;
    }

    public void takeTaxi(Taxi taxi) {
        taxi.take(money);
        money -= 10000;
    }

    public void showInfo() {
        System.out.printf("%s 학생의 돈 %d\n", studentName, money);
    }
}
