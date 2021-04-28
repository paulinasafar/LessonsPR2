package Lessons2804;

public class EScooter implements RentAirBnB{
    protected double distance;

    public EScooter(double distance) {
        this.distance = distance;
    }

    @Override
    public double rentAirBnB(int days) {
        return days * 20;
    }
}
