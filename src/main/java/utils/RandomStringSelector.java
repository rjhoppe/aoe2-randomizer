package utils;

import java.util.Random;

// Selects random string value from a String[] list
// TODO: turn this into a generic selector
public class RandomStringSelector {
    private RandomStringSelector() {
        // Private constructor to prevent instantiation
        throw new IllegalStateException("Utility class");
    }

    public static String pickRandomString(String[] stringList) {
        if (stringList == null || stringList.length == 0) {
            throw new IllegalStateException("Invalid string list, check if list is empty");
        }

        Random random = new Random();
        int randomIndex = random.nextInt(stringList.length);
        return stringList[randomIndex];
    }
}
