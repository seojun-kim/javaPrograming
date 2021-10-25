package ch10;

public class AICar extends Car{

    @Override
    public void drive() {
        System.out.println("자율 주행");
    }

    @Override
    public void stop() {
        System.out.println("목적지 도착");
    }
}
