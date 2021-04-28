package Lessons2804;

public class Flat extends PropertyII implements RentAirBnB{

    protected boolean furnished;
    protected int flatCategory;


    public Flat(String owner, double sizeInM2, String address, boolean furnished, int flatCategory) {
        super(owner, sizeInM2, address);
        this.furnished = furnished;
        this.flatCategory = flatCategory;
    }

    //for Flat category 1 price is 3000/m2
    //for Flats category 2 price is 2700/m2
    //for Flats category 3 price is 1800/m2
    //furnished adds 300/m2 for Cat 1
    //furnished adds 5000 for Cat 2 & Cat 3

    @Override
    public double upFrontCost() {
        double upFrontPrice = 0.0;

        switch (flatCategory) {
            case 1:
                upFrontPrice = sizeInM2 * 3000;
                if (furnished) {
                    upFrontPrice = upFrontPrice + (sizeInM2 * 300);
                }
                break;
            case 2:
                upFrontPrice = sizeInM2 * 2700;
                if (furnished) {
                    upFrontPrice = upFrontPrice + 5000;
                }
                break;
            case 3:
                upFrontPrice = sizeInM2 * 1800;
                if (furnished) {
                    upFrontPrice = upFrontPrice + 5000;
                }
                break;
        }
        return upFrontPrice;
    }


    //category 1 is m2 * 2/3
    //category 2 is m2 * 1.5
    //category 3 is m2 * 3.2

    @Override
    public double monthlyCost() {

        switch (flatCategory) {
            case 1:
                return sizeInM2 * 0.67;
            case 2:
                return sizeInM2 * 1.5;
            case 3:
                return sizeInM2 * 3.2;
        }
        return 0;
    }

    @Override
    public double rentAirBnB(int days) {
        return sizeInM2 / 2.0 * days;
    }
}
