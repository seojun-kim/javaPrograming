package ch15;

public class TakeTransTest {

    public static void main(String[] args) {

        Student student1 = new Student("Kim", 5000);
        Student student2 = new Student("Seo", 10000);
        Student student3 = new Student("Jun", 20000);

        Bus bus100 = new Bus(100);
        student1.takeBus(bus100);

        Subway subwayRed = new Subway("red");
        student2.takeSubway(subwayRed);

        Taxi taxiGoodGo = new Taxi("잘나간다 운수");
        student3.takeTaxi(taxiGoodGo);

        student1.showStudent();
        student2.showStudent();
        student3.showStudent();

        bus100.showBusInfo();
        subwayRed.showSubwayInfo();
        taxiGoodGo.showTaxiInfo();
    }
}
