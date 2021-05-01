package Uebungsbeispiele03;

import java.util.ArrayList;
import java.util.HashMap;

public class Blackjack {

    private HashMap<Player, Integer> players;

    public Blackjack() {
        this.players = new HashMap<>();
    }

    public boolean add(Player player) {
        if (players.containsKey(player)) {
            return false;
        } else {
            players.put(player, 0);
            return true;
        }
    }

    public boolean addCard(Player player, Integer cardValue) {
        if (players.containsKey(player)) {
            players.put(player, players.getOrDefault(player, 0) + cardValue);
            return true;
        }
        return false;
    }

    public Integer getPoints(Player player) {
        if (players.containsKey(player)) {
            return players.get(player);
        }
        return null;
    }

    public Player getWinner() {
        Player winner = new Player(" ", 0);
        int tempWinner = -1;

        for (Player player : players.keySet()) {
            if (players.get(player) <= 21 && players.get(player) >= tempWinner) {
                if (players.get(player) == tempWinner) {
                    return null;
                }
                tempWinner = players.get(player);
                winner = player;
            }
        }
        if (tempWinner < 10) {
            return null;
        } else {
            return winner;
        }
    }

    @Override
    public String toString() {
        String allPlayers = " ";
        for (Player key : players.keySet()) {
            allPlayers += key.getName() + ", card value: " + players.get(key).toString() + ", \n";
        }
        return allPlayers;
    }
}
