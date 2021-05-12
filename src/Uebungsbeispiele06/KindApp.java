package Uebungsbeispiele06;


import Lesson2004.HolidayComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KindApp {

    public static void main(String[] args) {

        Kind k1 = new Kind ("Andrea", "Maier", 7);
        Kind k2 = new Kind ("Sebastian", "Maier", 9);
        Kind k3 = new Kind ("Martina", "Weiss", 8);
        Kind k4 = new Kind ("Laura", "Schwarz", 6);
        Kind k5 = new Kind ("Franz", "Gelb", 9);

        Kindergarten garten = new Kindergarten("Sonnenblumen");
        garten.addKind(k1);
        garten.addKind(k2);
        garten.addKind(k3);
        garten.addKind(k4);
        garten.addKind(k5);

        System.out.println(garten);
        System.out.println();
        garten.sortAlphabetical();
        System.out.println(garten);
        System.out.println();
        garten.sortAge();
        System.out.println(garten);


        }
    }

