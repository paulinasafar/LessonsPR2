package Lesson2004;

public class Holiday {

    private String destination;
    private int lengthInDays;
    private int nrPersons;

    public Holiday(String destination, int lengthInDays, int nrPersons) {
        this.destination = destination;
        this.lengthInDays = lengthInDays;
        this.nrPersons = nrPersons;
    }

    public Holiday() {
        this.destination = "Österreich";
        this.lengthInDays = 2;
        this.nrPersons = 2;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getLengthInDays() {
        return lengthInDays;
    }

    public void setLengthInDays(int lengthInDays) {
        if(lengthInDays > 0) {
        this.lengthInDays = lengthInDays; }
    }

    public int getNrPersons() {
        return nrPersons;
    }

    public void setNrPersons(int nrPersons) {
        this.nrPersons = nrPersons;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "destination='" + destination + '\'' +
                ", lengthInDays=" + lengthInDays +
                ", nrPersons=" + nrPersons +
                '}';
    }
}
