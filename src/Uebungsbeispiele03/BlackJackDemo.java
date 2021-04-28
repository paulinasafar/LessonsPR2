package Uebungsbeispiele03;

public class BlackJackDemo {
    public static void main(String[] args) {


        Player player1 = new Player("John", 43);
        Player player2 = new Player("Martina", 35);
        Player player3 = new Player("Mimi", 58);
        Player player4 = new Player("Anna", 22);
        Player player5 = new Player("Franzl", 17);
        Player player6 = new Player("Demi", 28);


        Blackjack bj = new Blackjack();
        bj.add(player1);
        bj.add(player2);
        bj.add(player3);
        bj.add(player4);
        bj.add(player5);
        bj.add(player6);

        System.out.println(player1);
        System.out.println(bj);

        bj.addCard(player1, 8);
        bj.addCard(player2, 11);
        bj.addCard(player1, 2);
        bj.addCard(player3, 10);
        bj.addCard(player1, 7);
        bj.addCard(player3, 10);
        bj.addCard(player4, 7);
        bj.addCard(player5, 6);
        System.out.println(bj.addCard(player6, 9));
        bj.addCard(player5, 11);
        bj.addCard(player5, 9);

        System.out.println(bj.getPoints(player1) + player1.getName());
        System.out.println(bj.getPoints(player2) + player2.getName());
        System.out.println(bj.getPoints(player3) + player3.getName());
        System.out.println(bj.getPoints(player4) + player4.getName());
        System.out.println(bj.getPoints(player5) + player5.getName());
        System.out.println(bj.getPoints(player6) + player6.getName());
        System.out.println();
        System.out.println("Winner is: " + bj.getWinner());


    }

}
