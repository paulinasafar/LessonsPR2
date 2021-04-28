package Lessons2804;

// House derives from Property
// additional attributes: year of building
public class House extends PropertyII implements RentAirBnB {

    protected int yearBuilt;

    public House(String owner, double sizeInM2, String address, int yearBuilt) {
        super(owner, sizeInM2, address);
        this.yearBuilt = yearBuilt;
    }

    //for Houses built after 2010 price is 4000/m2
    //for Houses build between 1950 and including 2010 price is 2000/m2
    //for older Houses price is 3000/m2
    @Override
    public double upFrontCost() {
        double upFrontPrice = 0.0;

        if (yearBuilt > 2010) {
            upFrontPrice = sizeInM2 * 4000;
        } else if (yearBuilt >= 1950 && yearBuilt <= 2010) {
            upFrontPrice = sizeInM2 * 2000;
        } else if (yearBuilt < 1950) {
            upFrontPrice = sizeInM2 * 3000;
        }
        return upFrontPrice;
    }

    // for houses after 2015 cost is m2 * 2
    // houses between 1990 and 2015 m2 * 2.5
    // houses before 1990 m2 * 5
    @Override
    public double monthlyCost() {
        if (yearBuilt > 2015) {
            return sizeInM2 / 2;
        } else if (yearBuilt >= 1950 && yearBuilt <= 2010) {
            return sizeInM2 * 2.5;
        } else {
            return sizeInM2 * 5;
        }
    }
    //m2 price per day
    @Override
    public double rentAirBnB(int days) {
        return sizeInM2 * days;
    }
}
