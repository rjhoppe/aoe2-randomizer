package model;

import java.util.Random;

public class Game {
    private String difficulty;
    private String startingResources;
    private String gameSpeed;
    private String mapSize;
    private Boolean regicideMode;
    private Boolean allRevealed;
    private Boolean waterMapAllowed;
    private Boolean ally;
    private int populationCap;
    private int numOfComputers;
    private final String mapName;
    private final Random random = new Random();

    public Game() {
        setNumOfComputers();
        setDifficulty();
        setStartingResources();
        setGameSpeed();
        setRegicideMode();
        setAllRevealed();
        setWaterMapAllowed();
        setAlly();
        setMapSize();
        setPopCap();
        Map map = new Map();
        this.mapName = map.getRandomMap(this.waterMapAllowed);
    }

    public int getNumOfComputers() {
        return numOfComputers;
    }

    public void setNumOfComputers() {
        this.numOfComputers = random.nextInt(2, 5);
    }

    public Boolean isAlly() {
        return ally;
    }

    public void setAlly() {
        this.ally = false;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty() {
        String randomDifficulty;
        numOfComputers = getNumOfComputers();
        switch(numOfComputers) {
            case 2:
                String[] difficultyVals2 = {
                        "HD AI - Hardest",
                        "Definitive AI - Hard",
                };
                randomDifficulty = utils.RandomStringSelector.pickRandomString(difficultyVals2);
                break;
            case 3:
                String[] difficultyVals3 = {
                        "HD AI - Hard",
                        "HD AI - Hardest", // multi comp teams
                        "Definitive AI - Hard",
                };
                randomDifficulty = utils.RandomStringSelector.pickRandomString(difficultyVals3);
                break;
            case 4:
                String[] difficultyVals4 = {
                        "HD AI - Hard", // multi comp teams
                        "HD AI - Moderate",
                        "Definitive AI - Moderate",
                };
                randomDifficulty = utils.RandomStringSelector.pickRandomString(difficultyVals4);
                break;
            default:
                randomDifficulty = "Definitive AI - Hard";
        }
        this.difficulty = randomDifficulty;
    }

    public String getStartingResources() {
        return startingResources;
    }

    public void setStartingResources() {
        this.startingResources = "Standard";
    }

    public String getGameSpeed() {
        return gameSpeed;
    }

    public void setGameSpeed() {
        this.gameSpeed = "Normal";
    }

    public Boolean getRegicideMode() {
        return regicideMode;
    }

    public void setRegicideMode() {
        this.regicideMode = false;
    }

    public Boolean getAllRevealed() {
        return allRevealed;
    }

    public void setAllRevealed() {
        this.allRevealed = true;
    }

    public Boolean getWaterMapAllowed() {
        return waterMapAllowed;
    }

    public void setWaterMapAllowed() {
        this.waterMapAllowed = random.nextBoolean();
    }

    public String getMapName() {
        return mapName;
    }

    public String getMapSize() {
        return mapSize;
    }

    public void setMapSize() {
        String mapSizeCalc;
        numOfComputers = getNumOfComputers();
        if (isAlly()) {
            numOfComputers += 1;
        }
        switch (numOfComputers) {
            case 2:
                mapSizeCalc = "Normal - 6";
                break;
            case 4:
                mapSizeCalc = "Giant";
                break;
            default: // 3v3 settings
                mapSizeCalc = "Large - 8";
                break;
        }
        this.mapSize = mapSizeCalc;
    }

    public int getPopCap() {
        return populationCap;
    }

    public void setPopCap() {
        int popCapCalc;
        numOfComputers = getNumOfComputers();
        switch(numOfComputers) {
            case 2:
                popCapCalc = 200;
                break;
            case 4:
            case 5:
                popCapCalc = 100;
                break;
            default: // 3v3 settings
                popCapCalc = 125;
                break;
        }
        this.populationCap = popCapCalc;
    }
}
