package ch16.game;

public class Player {

    private PlayerLevel playerLevel;

    public Player() {
        playerLevel = new BeginnerLevel();
        playerLevel.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return playerLevel;
    }

    public void upgradeLevel(PlayerLevel playerLevel) {
        this.playerLevel = playerLevel;
        playerLevel.showLevelMessage();
    }

    public void play(int num) {
        playerLevel.go(num);
    }
}
