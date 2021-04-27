package Uebungsbeispiele03;

public class Event {

    private String title;
    private String place;
    private double entryPrice;

    public Event(String title, String place, double entryPrice) {
        this.title = title;
        this.place = place;
        this.entryPrice = entryPrice;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public double getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(double entryPrice) {
        this.entryPrice = entryPrice;
    }

    @Override
    public String toString() {
        return "Event" +
                "title='" + title + '\'' +
                ", place='" + place + '\'' +
                ", entryPrice=" + entryPrice;
    }
}
