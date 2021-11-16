package ch16.scheduler;

public class RoundRobin implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 가져옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("다음 순서에게 배분");
    }
}
