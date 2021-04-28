package Lessons2804;

public abstract class PropertyII {

    protected String owner;
    protected double sizeInM2;
    protected String address;

    public PropertyII(String owner, double sizeInM2, String address) {
        this.owner = owner;
        this.sizeInM2 = sizeInM2;
        this.address = address;
    }

    public abstract double upFrontCost();

    public abstract double monthlyCost();

}

