package ch16.game;

public class BeginnerLevel implements PlayerLevel {
    @Override
    public void run() {
        System.out.println("천천히 달린다.");
    }

    @Override
    public void jump() {
        System.out.println("점프하지 못한다.");
    }

    @Override
    public void turn() {
        System.out.println("돌지 못한다.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("Beginner Level");
    }
}
