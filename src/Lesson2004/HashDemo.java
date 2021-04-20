package Lesson2004;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashDemo {

    public static void main(String[] args) {

        HashSet<String> winner = new HashSet<>();
        winner.add("Heidemarie");
        winner.add("Mirjam");
        winner.add("Paulina");
        winner.add("Magdalena");
        winner.add("Violeta");

        for (String w : winner) {
            System.out.println(w);
        }

        System.out.println(winner.add("Magdalena"));

        Iterator<String> it = winner.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();


        //HashMap saving zip code + city name
        // zip code should be the key - i can use it to find city names very fast

        HashMap<Integer, String> zipCity = new HashMap<>();

        //add values with put function
        zipCity.put(8010, "Graz");
        zipCity.put(1010, "Wien");
        zipCity.put(9010, "Klagenfurt");
        zipCity.put(7010, "Innsbruck");


        //accerss the value with the key
        System.out.println("City " + zipCity.get(1010));

        // is it in HashMap?
        System.out.println("Key " + zipCity.containsKey(1010));

        // remove a key value pair
        zipCity.remove(9010);

        // how to iterate over HashMap (over keys)
        for (Integer zip : zipCity.keySet()) {
            System.out.println("Key: " + zip + " Value: " + zipCity.get(zip));
        }




    }
}
