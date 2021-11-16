package ch16.game;

public interface PlayerLevel {

    void run();
    void jump();
    void turn();
    void showLevelMessage();

    default void go(int num) {
        run();
        for(int i = 0; i < num; i++) {
            jump();
        }
        turn();
    }
}
