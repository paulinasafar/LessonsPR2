package Lessons2701;

import java.util.ArrayList;

public class AnimalsApp {

    public static void main(String[] args) {

        Fly flyable = new Bird("blue");
        Bird b = (Bird) flyable; //downcasting if we know what is behind

        b.winkeWinke();   // we can see every method    }

        flyable.fly();

        Fly fly2 = giveMeSomethingThatCanFly();

        ArrayList<Fly> allThingsInTheSky = new ArrayList<>();
        // List<String> newList = new ArrayList<>();   -> it doesn't interest me which type of list

        //allThingsInTheSky.add(quaxy); // does not work - quaxi ccan't fly;
        allThingsInTheSky.add(flyable);
        allThingsInTheSky.add(fly2);

        for(Fly f : allThingsInTheSky) {
            f.fly();
        }

    }
        public static Fly giveMeSomethingThatCanFly() {
            return new Bird("green");
}
