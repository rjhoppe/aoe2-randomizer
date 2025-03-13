package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Civ {
    private String randomCiv;
    private String civType;
    private List<String> civStrategy;
    private List<String> civWeakness;
    private final static String[] civilizations = {
            "Armenians",
            "Aztecs",
            "Bengalis",
            "Berbers",
            "Bohemians",
            "Britons",
            "Bulgarians",
            "Burgundians",
            "Burmese",
            "Byzantines",
            "Celts",
            "Chinese",
            "Cumans",
            "Dravidians",
            "Ethiopians",
            "Franks",
            "Georgians",
            "Goths",
            "Gurjaras",
            "Hindustanis",
            "Huns",
            "Incas",
            "Italians",
            "Japanese",
            "Khmer",
            "Koreans",
            "Lithuanians",
            "Magyars",
            "Malay",
            "Malians",
            "Mayans",
            "Mongols",
            "Persians",
            "Poles",
            "Portuguese",
            "Saracens",
            "Sicilians",
            "Slavs",
            "Spanish",
            "Tartars",
            "Teutons",
            "Turks",
            "Vietnamese",
            "Vikings"
    };

    private final static Map<String, String> civTypeMap;
    static {
        civTypeMap = new HashMap<>();
        civTypeMap.put("Armenians", "Infantry and Naval");
        civTypeMap.put("Aztecs", "Infantry and Monk");
        civTypeMap.put("Bengalis", "Elephant and Naval");
        civTypeMap.put("Berbers", "Cavalry and Naval");
        civTypeMap.put("Bohemians", "Gunpowder and Monk");
        civTypeMap.put("Britons", "Foot archer");
        civTypeMap.put("Bulgarians", "Infantry and Cavalry");
        civTypeMap.put("Burgundians", "Cavalry");
        civTypeMap.put("Burmese", "Monk and Elephant");
        civTypeMap.put("Byzantines", "Defensive");
        civTypeMap.put("Celts", "Infantry and Siege");
        civTypeMap.put("Chinese", "Archer");
        civTypeMap.put("Cumans", "Cavalry");
        civTypeMap.put("Dravidians", "Infantry and Naval");
        civTypeMap.put("Ethiopians", "Foot archer");
        civTypeMap.put("Franks", "Cavalry");
        civTypeMap.put("Georgians", "Cavalry and Defensive");
        civTypeMap.put("Goths", "Infantry");
        civTypeMap.put("Gurjaras", "Cavalry and Camel");
        civTypeMap.put("Hindustanis", "Camel and Gunpowder");
        civTypeMap.put("Huns", "Cavalry");
        civTypeMap.put("Incas", "Infantry");
        civTypeMap.put("Italians", "Foot archers and Naval");
        civTypeMap.put("Japanese", "Infantry");
        civTypeMap.put("Khmer", "Siege and Elephant");
        civTypeMap.put("Koreans", "Defensive and Naval");
        civTypeMap.put("Lithuanians", "Cavalry and Monk");
        civTypeMap.put("Magyars", "Cavalry");
        civTypeMap.put("Malay", "Infantry and Naval");
        civTypeMap.put("Malians", "Infantry");
        civTypeMap.put("Mayans", "Foot archer");
        civTypeMap.put("Mongols", "Mounted archers");
        civTypeMap.put("Persians", "Cavalry");
        civTypeMap.put("Poles", "Cavalry");
        civTypeMap.put("Portuguese", "Naval and Gunpowder");
        civTypeMap.put("Saracens", "Camel and Naval");
        civTypeMap.put("Sicilians", "Infantry and Cavalry");
        civTypeMap.put("Slavs", "Infantry and Siege");
        civTypeMap.put("Spanish", "Gunpowder and Monk");
        civTypeMap.put("Tartars", "Mounted archer");
        civTypeMap.put("Teutons", "Infantry");
        civTypeMap.put("Turks", "Gunpowder");
        civTypeMap.put("Vietnamese", "Archer");
        civTypeMap.put("Vikings", "Infantry and Naval");
    }

    private final static Map<String, List<String>> civStrategyMap;
    static {
        civStrategyMap = new HashMap<>();
        civStrategyMap.put("Armenians", Arrays.asList("Drush", "Flush", "Fast Castle"));
        civStrategyMap.put("Aztecs", Arrays.asList("Drush", "Eagle Warrior rush"));
        civStrategyMap.put("Bengalis", Arrays.asList("Booming", "Elephant spam"));
        civStrategyMap.put("Berbers", Arrays.asList("Knight rush", "Booming", "Trash war"));
        civStrategyMap.put("Bohemians", Arrays.asList("Archer rush", "Tower drop", "Fast Castle"));
        civStrategyMap.put("Britons", Arrays.asList("Flush", "Crossbowmen rush"));
        civStrategyMap.put("Bulgarians", Arrays.asList("Drush", "Long Swordsmen rush", "Knight rush", "Krepost drop"));
        civStrategyMap.put("Burgundians", Arrays.asList("Booming", "Cavalier rush in Castle Age"));
        civStrategyMap.put("Burmese", Arrays.asList("Flush", "Fast Castle", "Cavalry spam"));
        civStrategyMap.put("Byzantines", Arrays.asList("Booming", "Turtle"));
        civStrategyMap.put("Celts", Arrays.asList("Drush", "Flush"));
        civStrategyMap.put("Chinese", Arrays.asList("Crossbowmen rush", "Knight rush"));
        civStrategyMap.put("Cumans", Arrays.asList("Scout rush", "Knight / Steppe Lancer / Kipchak / Cav archer rush", "Early booming"));
        civStrategyMap.put("Dravidians", Arrays.asList("Flush", "Archer rush", "Fast Castle", "Infantry spam"));
        civStrategyMap.put("Ethiopians", Arrays.asList("Archer rush", "Flush", "Crossbowmen rush"));
        civStrategyMap.put("Franks", Arrays.asList("Knight rush", "Scout rush", "Castle drop", "Fast Castle"));
        civStrategyMap.put("Georgians", Arrays.asList("Scout rush", "Knight rush", "Booming", "Turtle"));
        civStrategyMap.put("Goths", Arrays.asList("Drush", "Flush", "Fast Castle", "Infantry spam"));
        civStrategyMap.put("Gurjaras", Arrays.asList("Scout rush", "Camel Scout rush", "Booming", "Cavalry spam"));
        civStrategyMap.put("Hindustanis", Arrays.asList("Booming", "Drush", "Scout rush"));
        civStrategyMap.put("Huns", Arrays.asList("Fast Castle", "Cavalry Archer rush", "Knight rush"));
        civStrategyMap.put("Incas", Arrays.asList("Tower rush", "Eagle Warrior rush", "Fast Castle"));
        civStrategyMap.put("Italians", Arrays.asList("Booming", "Fast Castle", "Galley rush"));
        civStrategyMap.put("Japanese", Arrays.asList("Flush", "Fast Castle"));
        civStrategyMap.put("Khmer", Arrays.asList("Fast Castle", "Archer rush", "Scout rush", "Scorpion and Elephant spam"));
        civStrategyMap.put("Koreans", Arrays.asList("Archer rush", "Turtle", "Booming"));
        civStrategyMap.put("Lithuanians", Arrays.asList("Scout rush", "Fast Castle", "Knight Rush"));
        civStrategyMap.put("Magyars", Arrays.asList("Flush", "Scout rush", "Trash war"));
        civStrategyMap.put("Malay", Arrays.asList("Elephant rush", "Naval spam", "Castle drop", "Trash war"));
        civStrategyMap.put("Malians", Arrays.asList("Flush", "Knight rush", "Booming"));
        civStrategyMap.put("Mayans", Arrays.asList("Archer rush", "Crossbowmen rush", "Archer and Eagle Warrior spam"));
        civStrategyMap.put("Mongols", Arrays.asList("Scout rush", "Mangudai and Siege spam"));
        civStrategyMap.put("Persians", Arrays.asList("Knight rush", "Persian Douche", "Booming"));
        civStrategyMap.put("Poles", Arrays.asList("Scout rush", "Flush", "Fast Castle", "Knight rush", "Trash wars"));
        civStrategyMap.put("Portuguese", Arrays.asList("Fast Castle", "Booming", "Gunpowder spam"));
        civStrategyMap.put("Saracens", Arrays.asList("Archer rush", "Booming", "Mameluke and Camel spam"));
        civStrategyMap.put("Sicilians", Arrays.asList("Flush", "Donjon drop", "Castle drop", "Booming", "Turtle"));
        civStrategyMap.put("Slavs", Arrays.asList("Knight rush", "Flush"));
        civStrategyMap.put("Spanish", Arrays.asList("Fast Castle", "Booming"));
        civStrategyMap.put("Tartars", Arrays.asList("Scout rush", "Knight / Steppe Lancer / Cav Archer rush", "Cavalry archer spam"));
        civStrategyMap.put("Teutons", Arrays.asList("Booming", "Tower rush", "Knight rush"));
        civStrategyMap.put("Turks", Arrays.asList("Fast Imperial", "Fast Castle", "Booming"));
        civStrategyMap.put("Vietnamese", Arrays.asList("Fast Imperial", "Cavalry Archer rush"));
        civStrategyMap.put("Vikings", Arrays.asList("Fast Castle", "Knight rush", "Berserk / Longboat spam"));
    }

    private final static Map<String, List<String>> civWeaknessesMap;
    static {
        civWeaknessesMap = new HashMap<>();
        civWeaknessesMap.put("Armenians", Arrays.asList("Slow economy", "Missing many key Imperial Age upgrades", "Particularly weak to powerful late-game archers and siege"));
        civWeaknessesMap.put("Aztecs", Arrays.asList("Weak late-game", "Gold reliant army", "Terrible late-game navy", "Weak defenses", "Mediocre archers"));
        civWeaknessesMap.put("Bengalis", Arrays.asList("Missing many key Imperial Age upgrades", "Mediocre siege", "Mediocre cavalry", "Vulernable to early game rushes"));
        civWeaknessesMap.put("Berbers", Arrays.asList("Weak defenses", "Weak siege", "Wood reliant army"));
        civWeaknessesMap.put("Bohemians", Arrays.asList("Weak cavalry", "Mediocre archers", "Slow economy", "Mediocre navy"));
        civWeaknessesMap.put("Britons", Arrays.asList("Weak cavalry", "Easily countered with Siege Rams", "Reliant on Trebuchets for siege", "Mediocre archer options outside of Longbowmen"));
        civWeaknessesMap.put("Bulgarians", Arrays.asList("Weak archers", "Mediocre defenses", "Weak navy", "Mediocre economy"));
        civWeaknessesMap.put("Burgundians", Arrays.asList("Weak archers", "Weak siege", "Mixed-bag unique unit", "Mediocre navy", "Needs to boom effectively to gain an advantage"));
        civWeaknessesMap.put("Burmese", Arrays.asList("Terrible archers", "Need cavalry and siege to counter archers", "Mediocre late-game navy"));
        civWeaknessesMap.put("Byzantines", Arrays.asList("Mediocre cavalry", "Mediocre siege", "Struggles to play offensively", "Unique unit weak vs cavalry and archers"));
        civWeaknessesMap.put("Celts", Arrays.asList("Weak archers", "Weak defenses", "Mediocre cavalry", "Mediocre trash war options"));
        civWeaknessesMap.put("Chinese", Arrays.asList("Difficult to play properly", "Easily disrupted", "Limited anti-siege options"));
        civWeaknessesMap.put("Cumans", Arrays.asList("Weak defenses", "Weak navy", "Mediocre late-game", "Cavalry archers are their only viable archers"));
        civWeaknessesMap.put("Dravidians", Arrays.asList("Weakest cavalry in the game", "Poor troop mobility"));
        civWeaknessesMap.put("Ethiopians", Arrays.asList("Missing many key Imperial Age upgrades", "Weak late-game navy"));
        civWeaknessesMap.put("Franks", Arrays.asList("Weak archers", "Terrible trash war options", "Strength fizzles out in the late gate"));
        civWeaknessesMap.put("Georgians", Arrays.asList("Mediocre rushing options", "Weak navy", "Mediocre archers"));
        civWeaknessesMap.put("Goths", Arrays.asList("Worst defenses in the game", "Weak to Siege Onagers", "Mediocre siege", "Mediocre archers", "Must constantly be on the offensive"));
        civWeaknessesMap.put("Gurjaras", Arrays.asList("Terrible infantry", "Terrible trash war options", "Heavily reliant on camels"));
        civWeaknessesMap.put("Hindustanis", Arrays.asList("Vulnerable to monk counter", "Weak knight line", "Weak defenses"));
        civWeaknessesMap.put("Huns", Arrays.asList("Weak infantry", "Mediocre siege", "Terrible defenses", "Predictable end game spam (Heavy Cav Archers, Siege Rams, Trebs)"));
        civWeaknessesMap.put("Incas", Arrays.asList("Heavily reliant on massing unique unit to counter cavalry", "Particularly weak against Aztecs and Mayans", "No significant military bonuses"));
        civWeaknessesMap.put("Italians", Arrays.asList("Struggles to counter cavalry without unique unit", "Slow economy", "Weak siege", "Lack of bonuses until Imperial"));
        civWeaknessesMap.put("Japanese", Arrays.asList("Weak cavalry", "Weak siege", "Weak late-game economy"));
        civWeaknessesMap.put("Khmer", Arrays.asList("Weak infantry", "Civ bonus can be a double-edged sword", "Mediocre archers"));
        civWeaknessesMap.put("Koreans", Arrays.asList("Slow economy", "Weak cavalry"));
        civWeaknessesMap.put("Lithuanians", Arrays.asList("Mediocre siege", "Mediocre infantry"));
        civWeaknessesMap.put("Magyars", Arrays.asList("Terrible infantry", "Weak defenses", "Mediocre siege"));
        civWeaknessesMap.put("Malay", Arrays.asList("Generally, pretty terrible at land combat", "Worst cavalry in the game", "Weak infantry", "Limited to only Arbalesters for anti-infantry"));
        civWeaknessesMap.put("Malians", Arrays.asList("Missing many key late-game blacksmith upgrades", "Weak late-game infantry and navy"));
        civWeaknessesMap.put("Mayans", Arrays.asList("Unable to counter late-game heavy cavalry or gunpowder", "Terrible swordsmen line"));
        civWeaknessesMap.put("Mongols", Arrays.asList("Weak mid game", "Limited tech tree outside of Mangudai, siege, and Hussars, Limited trash war options"));
        civWeaknessesMap.put("Persians", Arrays.asList("Weak late-game", "Highly reliant on heavy cavalry", "Elephants are easily countered with monks"));
        civWeaknessesMap.put("Poles", Arrays.asList("Weak to elephants", "Glass cannon cavalry weak to tougher/heavier cavalry", "Weak anti-cav", "Weak navy"));
        civWeaknessesMap.put("Portuguese", Arrays.asList("Expensive navy", "Weak late-game cavalry and siege", "Slow units"));
        civWeaknessesMap.put("Saracens", Arrays.asList("Weak late-game economy", "Lack of affordable, late-game anti-cav options", "Highly reliant on gold", "Terrible trash war options"));
        civWeaknessesMap.put("Sicilians", Arrays.asList("Weak to early rushing", "Slow early-game economy", "Bad archers", "Weak late-game due to mediocre tech tree"));
        civWeaknessesMap.put("Slavs", Arrays.asList("Weak to early rushing", "Poor defensive options", "Weak archers"));
        civWeaknessesMap.put("Spanish", Arrays.asList("Weak early-game", "Terrible foot archer options", "Average siege", "Weak to Flush or Fast Castle"));
        civWeaknessesMap.put("Tartars", Arrays.asList("Worst infantry in game", "Unable to counter cavalry or Eagle Warriors"));
        civWeaknessesMap.put("Teutons", Arrays.asList("Slow early-game", "Mediocre cavalry and archer options", "Terrible trash war options"));
        civWeaknessesMap.put("Turks", Arrays.asList("Weak early-game", "Susceptible to rushes", "Terrible trash war options", "Highly reliant on gold"));
        civWeaknessesMap.put("Vietnamese", Arrays.asList("Terrible siege", "Weak infantry and cavalry"));
        civWeaknessesMap.put("Vikings", Arrays.asList("Limited cavalry options", "Weak to Galley rush", "Weak to Onagers"));
    }

    public String getRandomCiv() {
        return randomCiv;
    }

    public void setRandomCiv() {
        String randomlySelectedCiv;
        randomlySelectedCiv = utils.RandomStringSelector.pickRandomString(civilizations);
        this.randomCiv = randomlySelectedCiv;
    }

    public String getCivType() {
        return civType;
    }

    public void setCivType(String randomCiv) {
        this.civType = civTypeMap.get(randomCiv);
    }

    public String getCivStrategy() {
        return String.join(", ", civStrategy);
    }

    public void setCivStrategy(String randomCiv) {
        this.civStrategy = civStrategyMap.get(randomCiv);
    }

    public String getCivWeakness() {
        return String.join(", ", civWeakness);
    }

    public void setCivWeakness(String randomCiv) {
        this.civWeakness = civWeaknessesMap.get(randomCiv);
    }
}
