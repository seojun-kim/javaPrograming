package ch16.game;

public class SuperLevel implements PlayerLevel {
    @Override
    public void run() {
        System.out.println("매우 빨리 달린다.");
    }

    @Override
    public void jump() {
        System.out.println("높게 점프한다.");
    }

    @Override
    public void turn() {
        System.out.println("돈다");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("Super Level");
    }
}
