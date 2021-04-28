package Lessons2804;

import java.lang.reflect.Array;

public class RentedFlat extends Flat{

    protected boolean kitchenIncluded;

    public RentedFlat(String owner, double sizeInM2, String address, boolean furnished, int flatQuality, boolean kitchenIncluded) {
        super(owner, sizeInM2, address, furnished, flatQuality);
        this.kitchenIncluded = kitchenIncluded;
    }
    // here we are no longer forced to implement the abstract methods
    // because they are already implemented in the "Flat" class
    // we can oweverwrite them if we want to, but we don't have to


    //for Cat 1 3x monthly rent
    //for Cat 2 2x monthly rent
    //for Cat 3 1.5x monthly rent
    @Override
    public double upFrontCost() {
        switch (flatCategory) {
            case 1:
                return monthlyCost() * 3;
            case 2:
                return monthlyCost() * 2;
            case 3:
                return monthlyCost() * 1.5;
        }
        return 0;
    }

    //Cat 1: m2 * 18; for kitchen extra 70
    //Cat 2: m2 * 10; for kitchen extra 40
    //Cat 3: m2 * 7; for kitchen extra 15
    @Override
    public double monthlyCost() {
        double monthlyPrice = 0.0;

        switch (flatCategory) {
            case 1:
                monthlyPrice = sizeInM2 * 3000;
                if (kitchenIncluded) {
                    monthlyPrice = monthlyPrice + (sizeInM2 * 300);
                }
                break;
            case 2:
                monthlyPrice = sizeInM2 * 2700;
                if (kitchenIncluded) {
                    monthlyPrice = monthlyPrice + 5000;
                }
                break;
            case 3:
                monthlyPrice = sizeInM2 * 1800;
                if (kitchenIncluded) {
                    monthlyPrice = monthlyPrice + 5000;
                }
                break;
        }
        return monthlyPrice;
    }

    @Override
    public double rentAirBnB(int days) {
        return 0;
    }
}
