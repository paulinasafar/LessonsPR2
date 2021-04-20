package Lesson2004;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> namesForLuckyDraw = new ArrayList<String>(50);
        ArrayList<Double> numbers = new ArrayList<Double>(50);

        //add elements to end of arraylist
        namesForLuckyDraw.add("Relindis");
        namesForLuckyDraw.add("Lusia");
        namesForLuckyDraw.add("Stefanie");
        namesForLuckyDraw.add("Julia");
        namesForLuckyDraw.add("Magdalena");

        // how many elements in arraylist
        System.out.println(namesForLuckyDraw.size());

        // get element from arraylist
        System.out.println(namesForLuckyDraw.get(3));
        System.out.println(namesForLuckyDraw.get(0));

        // remove element from arraylist (the second element)
        namesForLuckyDraw.remove(1);
        System.out.println(namesForLuckyDraw.get(1));

        // is element in there?
        System.out.println(namesForLuckyDraw.contains("Julia"));
        System.out.println(namesForLuckyDraw.contains("Violeta"));

        // how to iterate over it - possibility 1 "for loop"
        for (int i = 0; i < namesForLuckyDraw.size(); i++) {
            System.out.print(namesForLuckyDraw.get(i)+ ", ");
        }
        System.out.println();
        // how to iterate over it - possibility 2 "for each loop"
        for(String elm : namesForLuckyDraw) {
            System.out.print(elm + ", ");
        }
        System.out.println("\n--------------------------------------------------------------------");
        //how to iterate over it - possibility 3 "Iterator"




        // now to LInkedList -  create a linked list with a content of the arraylist
        LinkedList<String> winner = new LinkedList<>(namesForLuckyDraw);
        System.out.println(winner.getFirst());
        System.out.println(winner.getLast());

        // iterate over it (slower)
        for (int i = 0; i < winner.size(); i++) {
            System.out.print(winner.get(i) + ", ");    // this will be slower
        }
        System.out.println();

        // better to do the for-each;

        for(String elm : winner) {
            System.out.print(elm + ", ");
        }
        System.out.println();

        // iterate over it with Iterator
        Iterator<String> i = winner.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + ", ");
        }

        Iterator<String> it = namesForLuckyDraw.iterator();
        while(i.hasNext()) {
            String elm = it.next();
            System.out.print(elm + " ");
        }
        System.out.println();
        Iterator<String> lIt = winner.iterator();
        while(lIt.hasNext()) {
            System.out.print(lIt.next() + " ");
        }

    }
}
