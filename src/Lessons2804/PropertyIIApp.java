package Lessons2804;

import java.util.ArrayList;

public class PropertyIIApp {

    public static void main(String[] args) {

        House house1 = new House("John", 145,"PR1",2005);
        House house2 = new House("John", 255,"PR1",2015);
        House house3 = new House("John", 320,"PR1",1989);
        House house4 = new House("John", 294,"PR1",1945);

        Flat flat1 = new Flat("John", 120,"PR1", true,2);
        Flat flat2 = new Flat("John", 92,"PR1", false,1);
        Flat flat3 = new Flat("John", 75,"PR1", true,3);
        Flat flat4 = new Flat("John", 58,"PR1", false,1);

        RentedFlat rflat1 = new RentedFlat("John", 132,"PR1", true, 3, true);
        RentedFlat rflat2 = new RentedFlat("John", 66,"PR1", true, 3, true);
        RentedFlat rflat3 = new RentedFlat("John", 89,"PR1", true, 3, true);

        System.out.println();
        System.out.println("House 1: " + house1.upFrontCost());
        System.out.println("House 2: " + house1.monthlyCost());
        System.out.println();
        System.out.println("Flat 3: " + flat3.upFrontCost());
        System.out.println("Flat 4: " + flat4.monthlyCost());
        System.out.println();
        System.out.println("RentedFlat 1: " + rflat1.upFrontCost());
        System.out.println("RentedFlat 2: " + rflat2.monthlyCost());
        System.out.println("-----------------------------------------------------------");

        // airbnb parated - we rent everything on airbnb for the next week
        ArrayList<RentAirBnB> air = new ArrayList<>();
        air.add(house1);
        air.add(flat1);
        air.add(rflat1);

        EScooter scoot = new EScooter(25);
        air.add(scoot);

        for(RentAirBnB element : air) {
            System.out.println(element.rentAirBnB(7));
        }

    }
}
