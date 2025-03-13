package utils;

import model.Player;

public class AddToOutput {
    private AddToOutput() {
        // Private constructor to prevent instantiation
        throw new IllegalStateException("Utility class");
    }

    public static String addStringToOutput(String curOutput, int count, Player player) {
        String newOutput = (
                "Computer %d (Enemy): %s -> %s \n" +
                "Civ Weaknesses: %s \n").formatted(
                        count, player.getCiv(), player.getCivType(), player.getPlayerCivWeakness()
        );

        return curOutput + newOutput;
    }
}
