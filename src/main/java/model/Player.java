package model;

public class Player {
    private String playerCiv;
    private final String playerCivType;
    private final String playerCivStrategy;
    private String playerCivWeakness;
    private String playerName;

    public Player() {
        Civ randomCiv = new Civ();
        randomCiv.setRandomCiv();
        this.playerCiv = randomCiv.getRandomCiv();
        randomCiv.setCivType(playerCiv);
        this.playerCivType = randomCiv.getCivType();
        randomCiv.setCivStrategy(playerCiv);
        this.playerCivStrategy = randomCiv.getCivStrategy();
        randomCiv.setCivWeakness(playerCiv);
        this.playerCivWeakness = randomCiv.getCivWeakness();
    }

    public String getCiv() {
        return playerCiv;
    }

    public String getCivType() {
        return playerCivType;
    }

    public String getCivStrategy() {
        return playerCivStrategy;
    }

    public String getPlayerCivWeakness() {
        return playerCivWeakness;
    }

    public void setRandomCivNull() {
        this.playerCiv = null;
    }

    // If you want to hide the weakness section later on
    public void setCivWeaknessToHidden() {
        this.playerCivWeakness = "Hidden";
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
