package ch14;

public class TakeTransTest {

    public static void main(String[] args) {

        Student studentJ = new Student("james", 5000);
        Student studentT = new Student("Tomas", 10000);
        Student studentE = new Student("Edward", 20000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);
        studentJ.takeBus(bus100);

        Subway greenSubway = new Subway(1);
        studentT.takeSubway(greenSubway);

        Taxi comTaxi = new Taxi("잘나간다 운수");
        studentE.takeTaxi(comTaxi);

        studentJ.showInfo();
        studentT.showInfo();
        studentE.showInfo();

        bus100.showBusInfo();
        greenSubway.showBusInfo();
        comTaxi.showTaxiInfo();
    }
}
