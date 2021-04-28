package Uebungsbeispiele03;

import java.util.HashMap;

public class Blackjack {

      private HashMap<Player, Integer> players = new HashMap<>();

    public Blackjack() {
        this.players = players;
    }

    public boolean add(Player player){
        if(players.containsKey(player)) {
            return false;
        }else {
            players.put(player, 0);
            return true;
        }
    }

    public boolean addCard(Player player, Integer cardValue) {
        if (players.containsKey(player)) {
            players.put(player, players.getOrDefault(player,0) + cardValue);
            return true;
        }
    return false;
    }

    public Integer getPoints(Player player) {
            if(players.containsKey(player)) {
                return players.get(player);
            }
    return null;
    }

    public Player getWinner() {
        Player winner = new Player(" ", 0);
        int tempWinner = 0;

        for (Player player : players.keySet()) {
            if(players.get(player) <= 21 && players.get(player) > tempWinner ) {
                winner = player;
            }
        return winner;}

    return null;}

    @Override
    public String toString() {
        return "\n" + players.keySet() + ", card value= " + players.values();
    }
}
