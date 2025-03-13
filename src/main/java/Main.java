import com.eduardomcb.discord.webhook.WebhookClient;
import com.eduardomcb.discord.webhook.WebhookManager;
import com.eduardomcb.discord.webhook.models.Message;
import io.github.cdimascio.dotenv.Dotenv;
import model.Game;
import model.Player;
import java.util.ArrayList;
import java.util.List;

import static utils.AddToOutput.addStringToOutput;

public class Main {
    public static void main(String[] args) {
        Game newGame = new Game();
        Dotenv dotenv = Dotenv.configure().load();
        String webhookUrl = dotenv.get("WEBHOOK_URL");
        String hasAlly;
        if (newGame.isAlly()) {
            hasAlly = "Ally";
        } else {
            hasAlly = "Enemy";
        }

        Player player1 = new Player();
        player1.setPlayerName("Player 1");
        Player player2 = new Player();
        player2.setPlayerName("Player 2");
        Player player3 = new Player();
        player3.setPlayerName("Player 3");

        List<Player> computerList = new ArrayList<>();
        for (int i = 0; i < newGame.getNumOfComputers(); i++) {
            Player computer = new Player();
            computer.setPlayerName("Computer " + (i + 1));
            computerList.add(computer);
        }

        Player computer1 = computerList.getFirst();
        String discordMessage = ("Game settings: \n" +
                "-------------------------------- \n" +
                "Map: %s \n" +
                "Difficulty: %s \n" +
                "Population Cap: %d \n" +
                "Number of Enemies: %d \n" +
                "Computer Ally: %b \n" +
                "\n" +
                "Advanced Game Settings \n" +
                "-------------------------------- \n" +
                "Starting Resources: %s \n" +
                "Game Speed: %s \n" +
                "Map Size: %s \n" +
                "Water Map: %b \n" +
                "All Revealed: %b\n" +
                "\n" +
                "Player Civs \n" +
                "-------------------------------- \n" +
                "Player 1: %s -> %s \n" +
                "Civ Strategies: %s \n" +
                "Player 2: %s -> %s \n" +
                "Civ Strategies: %s \n" +
                "Player 3: %s -> %s \n" +
                "Civ Strategies: %s \n" +
                "\n" +
                "Scouting Report \n" +
                "-------------------------------- \n" +
                "Computer 1 (%s): %s -> %s \n" +
                "Civ Weaknesses: %s \n").formatted(
                        newGame.getMapName(), newGame.getDifficulty(), newGame.getPopCap(),
                        newGame.getNumOfComputers(), newGame.isAlly(), newGame.getStartingResources(),
                        newGame.getGameSpeed(), newGame.getMapSize(), newGame.getWaterMapAllowed(), newGame.getAllRevealed(),
                        player1.getCiv(), player1.getCivType(), player1.getCivStrategy(),
                        player2.getCiv(), player2.getCivType(), player2.getCivStrategy(),
                        player3.getCiv(), player3.getCivType(), player3.getCivStrategy(),
                        hasAlly, computer1.getCiv(), computer1.getCivType(), computer1.getPlayerCivWeakness()
                );

        for(int i = 1; i < computerList.size(); i++) {
            if (computerList.get(i).getCiv() != null) {
                discordMessage = addStringToOutput(discordMessage, i+1, computerList.get(i));
            }
        }

        Message message = new Message()
                .setContent(discordMessage);

        WebhookManager webhookManager = new WebhookManager()
                .setChannelUrl(webhookUrl)
                .setMessage(message);

        // Send the message and handle the response
        webhookManager.setListener(new WebhookClient.Callback() {
            @Override
            public void onSuccess(String response) {
                System.out.println("Message sent successfully");
            }

            @Override
            public void onFailure(int statusCode, String errorMessage) {
                System.out.println("Code: " + statusCode + " error: " + errorMessage);
            }
        });
        webhookManager.exec();
    }
}
