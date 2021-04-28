package Uebungsbeispiele03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class EvenCalender {

    private ArrayList<Event> events;

    public EvenCalender() {
        this.events = new ArrayList<Event>();
    }

    public void addEvent(Event e) {
        events.add(e);
    }

    public Event getByTitle(String title) {
        Event byTitle = new Event("", "", 0.0);
        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getTitle() == title) {
                byTitle = events.get(i);
            }
        }
        return byTitle;
    }

    public ArrayList<Event> getByPlace(String place) {
        ArrayList<Event> newEvents = new ArrayList<Event>();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getPlace() == place) {
                newEvents.add(events.get(i));
            }
        }
        return newEvents;
    }

    public ArrayList<Event> getByEintrittsPreis(double min, double max) {
        ArrayList<Event> newEvents = new ArrayList<Event>();

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getEntryPrice() >= min && events.get(i).getEntryPrice() <= max) {
                newEvents.add(events.get(i));
            }
        }
        return newEvents;
    }

    public Event getMostExpensiveByPlace(String place) {
        Event byPrice = new Event("", "", 0.0);

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getPlace().equals(place)) {
                if (byPrice.getEntryPrice() < events.get(i).getEntryPrice()) {
                    byPrice = events.get(i);
                }
            }
        }
        return byPrice;
    }

    public double getAvgPriceByPlace(String place) {
        double sum = 0.0;
        double averagePrice = 0.0;
        int counter = 0;

        for (int i = 0; i < events.size(); i++) {
            if (events.get(i).getPlace() == place) {
                sum += events.get(i).getEntryPrice();
                counter++;
            }
        }
        averagePrice = sum / counter;
        return averagePrice;
    }

    public HashMap<String, Integer> getCountEventsByPlace() {
        HashMap<String, Integer> newMap = new HashMap<>();

        for(Event e : events) {
            newMap.put(e.getPlace(), newMap.getOrDefault(e.getPlace(), 0) +1);
        }
        return newMap;
    }

    public HashMap<String, Double> getSumPriceEventsByPlace() {
        HashMap<String, Double> newMap = new HashMap<>();

        for(Event e : events) {
            newMap.put(e.getPlace(), newMap.getOrDefault(e.getPlace(), 0.0) + e.getEntryPrice());
        }

    return newMap;
    }

}
