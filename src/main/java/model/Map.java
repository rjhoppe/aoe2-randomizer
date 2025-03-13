package model;

import java.util.Random;

public class Map {
    Random random = new Random();
    private final static String[] mapTypes = {
            "Random",
            "Land",
            "Water",
    };

    private final static String[] randomMaps = {
            "Black Forest",
            "Arabia",
            "Amazon Tunnel",
            "Team Islands",
            "Islands",
            "Snake Forest",
            "Gold Rush",
            "Land Nomad",
            "Seize the Mountain",
            "Team Moats",
            "Hideout",
            "Land Madness"
    };

    private final static String[] landMaps = {
            "Black Forest",
            "Amazon Tunnel",
            "Snake Forest",
            "Gold Rush",
            "Land Nomad",
            "Seize the Mountain",
            "Team Moats",
            "Hideout",
            "Land Madness",
    };

    private final static String[] waterMaps = {
            "Islands",
            "Team Islands",
            "Mediterranean",
            "Continental",
    };

    public String getRandomMap(Boolean waterMapAllowed) {
        String mapType;
        String mapName;
        if (waterMapAllowed) {
            int randomMapTypeIndex = random.nextInt(mapTypes.length);
            mapType = mapTypes[randomMapTypeIndex];
        } else {
            mapType = "Land";
        }

        switch (mapType) {
            case "Water":
                mapName = utils.RandomStringSelector.pickRandomString(waterMaps);
                break;
            case "Land":
                mapName = utils.RandomStringSelector.pickRandomString(landMaps);
                break;
            default:
                mapName = utils.RandomStringSelector.pickRandomString(randomMaps);
                break;
        }
        return mapName;
    }
}
