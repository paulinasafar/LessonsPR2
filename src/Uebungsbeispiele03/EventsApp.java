package Uebungsbeispiele03;

import java.util.ArrayList;

public class EventsApp {

    public static void main(String[] args) {

        Event eve1 = new Event("Concert", "Vienna", 155.12);
        Event eve2 = new Event("Football Game", "Graz", 250.12);
        Event eve3 = new Event("Truck Rally", "London", 255.12);
        Event eve4 = new Event("Opera", "Vienna", 122.12);
        Event eve5 = new Event("Basketball Game", "London", 201.01);
        Event eve6 = new Event("Truck Rally", "London", 189.12);
        Event eve7 = new Event("Concert", "Zagreb", 95.12);

        EvenCalender events1 = new EvenCalender();

        events1.addEvent(eve1);
        events1.addEvent(eve2);
        events1.addEvent(eve3);
        events1.addEvent(eve4);
        events1.addEvent(eve5);
        events1.addEvent(eve6);
        events1.addEvent(eve7);
    }
}
