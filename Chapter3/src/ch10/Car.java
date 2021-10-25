package ch10;

public abstract class Car {

    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동 걸기");
    }

    public void turnOff() {
        System.out.println("시동 끔");
    }

    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
    }
}
