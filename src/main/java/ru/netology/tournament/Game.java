package ru.netology.tournament;

import ru.netology.tournament.domain.Player;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private final List<Player> players = new ArrayList<>();

    public void register(Player player) {
        players.add(player);
    }

    public int round(String playerName1, String playerName2) {
        var player1 = findPlayerByName(playerName1);
        var player2 = findPlayerByName(playerName2);

        int strength1 = player1.getStrength();
        int strength2 = player2.getStrength();
        if (strength1 == strength2) {
            return 0;
        }
        if (strength1 > strength2) {
            return 1;
        } else {
            return 2;
        }
    }

    private Player findPlayerByName(String playerName) {
        for (Player player : players) {
            if (player.getName().equals(playerName)) {
                return player;
            }
        }
        throw new NotRegisteredException(playerName);
    }
}
