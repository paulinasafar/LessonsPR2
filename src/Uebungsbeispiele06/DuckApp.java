package Uebungsbeispiele06;

import java.util.Collections;

public class DuckApp {

    public static void main(String[] args) {

        FlyingDuck fd1 = new FlyingDuck("Joe", 120, 56);
        FlyingDuck fd2 = new FlyingDuck("Mimi", 42, 42);
        FlyingDuck fd3 = new FlyingDuck("Eli", 68, 18);
        SwimmingDuck sd1 = new SwimmingDuck("Pipi", 189, 65);
        SwimmingDuck sd2 = new SwimmingDuck("Lili", 202, 77);
        SwimmingDuck sd3 = new SwimmingDuck("Bibi", 148, 49);

        System.out.println(fd1.compareTo(fd2));
        System.out.println(sd2.makeNoise());
        System.out.println(sd3.getFullWeight());

        System.out.println("--------------------------------------------------------------------");
        DuckHouse house = new DuckHouse();
        house.addDuck(fd1);
        house.addDuck(fd2);
        house.addDuck(fd3);
        house.addDuck(sd1);
        house.addDuck(sd2);
        house.addDuck(sd3);

        System.out.println(house);
        Collections.sort(house.getDuckHouse());
        System.out.println(house);
        System.out.println();
        System.out.println(house.getGroupedDucks());

    }
}
