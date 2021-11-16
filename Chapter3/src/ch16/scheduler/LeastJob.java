package ch16.scheduler;

public class LeastJob implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 순서대로 가져옴");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무가 적거나 없는 상담원에거 연결");
    }
}
