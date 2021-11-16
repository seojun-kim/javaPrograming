package ch16.scheduler;

public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("등급이 높은 저화를 가져옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 잘 하는사람한테 연결");
    }
}
