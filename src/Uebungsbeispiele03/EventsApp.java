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

        System.out.println("Average price by place: " + events1.getAvgPriceByPlace("Vienna"));
        System.out.println();
        System.out.println("By entry price: " + events1.getByEintrittsPreis(100, 200));
        System.out.println();
        System.out.println("Count events by place: " + events1.getCountEventsByPlace());
        System.out.println();
        System.out.println("By Title: " + events1.getByTitle("Concert"));
        System.out.println();
        System.out.println("By Place: " + events1.getByPlace("Vienna"));
        System.out.println();
        System.out.println("Most Expensive by Place: " + events1.getMostExpensiveByPlace("London"));
        System.out.println();
        System.out.println("Sum Price by Place: " + events1.getSumPriceEventsByPlace());

    }
}
