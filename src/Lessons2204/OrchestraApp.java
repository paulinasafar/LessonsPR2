package Lessons2204;

public class OrchestraApp {

    public static void main(String[] args) {
        //Instrument int1 = new Instrument(1);
        //Instrument int2 = new Instrument(3);
        //Instrument int3 = new Instrument(5);

        Violin violin1 = new Violin(2);
        Drum drum1 = new Drum(10);
        Piano piano1 = new Piano (6);

        System.out.println(violin1);
        System.out.println(drum1);
        System.out.println(piano1);

        //int1 = (Violin) violin1;
        //int2 = (Drum) drum1;
        //int3 = (Piano) piano1;

        System.out.println("----------------------------------------------------");

        Orchestra orchestra1 = new Orchestra();
        orchestra1.addToArray(violin1);
        orchestra1.addToArray(drum1);
        orchestra1.addToArray(piano1);

        System.out.println(orchestra1);
        System.out.println();
        orchestra1.playAll(orchestra1.orchestra);

        Instrument i = (Violin) violin1;

    }

}
