package Lessons1404;

import java.util.Arrays;

public class BunnyApp {

    public static void main(String[] args) {

        Bunny bugs = new Bunny("Bugs", "carrots", Seasons.SUMMER);
        Bunny roger = new Bunny("Roger", "choco carrots", Seasons.SPRING);
        System.out.println();
        System.out.println(Arrays.deepToString(Seasons.values()));
        System.out.println();
        bugs.setName("Bunny2");
//        System.out.println(bugs.getName());
//        bugs.setFavoriteFood("ananas cake");
//        System.out.println(bugs.getFavoriteFood());
//        System.out.println(bugs.favoriteFood);
//        System.out.println();

//        System.out.println(bugs.favoriteFood);

        // crash course ? : operator
        // condition ? execute if true : execute if false
        // 27 < 42 ? "yes" : "no"
        String x;
        x = 27 < 42 ? "yes" : "no";
        System.out.println(x);
        // short notation for:
        if(27 < 42) {
            x = "yes";
        } else { x = "no";}

//        bugs.setName("Bugs Bunny");

        //test array with bunnies
        Bunny[] bunnies = new Bunny[12];
        bunnies[0] = bugs;
        bunnies[1] = roger;

        for (int i = 0; i < bunnies.length; i++) {
            if (bunnies[i] != null) {
                System.out.println(bunnies[i]);
        }
        }

//        Account[] myAccounts = {number1, number2, number3}
//        for (Account account : myAccounts){
//            System.out.println(account.owner + " " + account.balance);
//        }

        System.out.println("Bugs ID " + bugs.getbID());
        System.out.println("Roger ID " + roger.getbID());
    }
}
