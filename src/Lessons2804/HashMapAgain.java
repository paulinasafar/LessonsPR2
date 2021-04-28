package Lessons2804;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapAgain {

    public static void main(String[] args) {

        // hashmap consists of key and value - never a value alone - DATA ENTERED ONLY IN PAIRS
        // Special thing is how data is organised - THERE IS NO ORDER!
        // e.g. when did we enter the data - they are sorted according to respective key
        // keys are "the keys" to access elements - navigation helper for data structure
        // working very fast, nearly no time!
        // arraylist needs to search though the whole list, hashmap goes immediately to the key + value
        HashMap<String, Integer> hashi = new HashMap<>();

        hashi.put("Kleinsasser", 5);
        hashi.put("Summer", 0);
        hashi.put("Kofler", 3);
        hashi.put("Trauber", 8);
        // data can also be updated
        hashi.put("Kofler", 4);

        // how can I access data in it
        // when you know the key is there, then just specify it
        System.out.println(hashi.get("Summer"));

        // however, what happens when there is no value there
        System.out.println(hashi.get("Cautin"));

        // alternative (very useful if we count something)
        hashi.getOrDefault("Cautin", 0);

        // check if a key is in hashmap
        System.out.println(hashi.containsKey("Kleinsasser"));

        // we can iterate over it
        for (String key : hashi.keySet()) {
            System.out.println(key + " " + hashi.get(key));
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Weirer");
        names.add("Summer");
        names.add("Wild");
        names.add("Weirer");
        names.add("Cautin Epifani");
        names.add("Burila");
        names.add("Summer");
        names.add("Weirer");
        names.add("De Franco");
        names.add("Chevillotte");
        names.add("Weirer");

        System.out.println(countLaughs(names));

    }

    // write a static method which returns a
    // HashMap<String, Integer> countLaugh(ArrayList>String> names)
    // the arraylist contans names of the people laughing
    // names = ["Weirer", "Summer", "Wild", "Weirer","Safar", "Weirer", "...]

    protected static HashMap<String, Integer> countLaughs(ArrayList<String> names) {
        HashMap<String, Integer> countLaugh = new HashMap<>();
        for (String element : names) {
            countLaugh.put(element, countLaugh.getOrDefault(element, 0) + 1);
        }

//        if (countLaugh.containsKey(element)) {
//            countLaugh.put(element, countLaugh.get(element) + 1);
//        } else {
//            countLaugh.put(element, 1);
//        }
        return countLaugh;
    }
}

