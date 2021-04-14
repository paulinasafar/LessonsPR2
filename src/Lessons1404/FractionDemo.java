package Lessons1404;

import java.util.Arrays;

public class FractionDemo {

    public static void main(String[] args) {

        Fraction b1 = new Fraction(2, 3);
        Fraction b2 = new Fraction(1, 4);
        Fraction b3 = new Fraction(1, 6);
        Fraction b4 = new Fraction(3, 8);
        Fraction b7 = new Fraction(4, 15);

        System.out.println();
        System.out.println(b1.getNumerator());
        System.out.println(b1.getDenominator());

        System.out.println();
        System.out.println(b1.ToDecimal());
        System.out.println(b2.ToDecimal());
        System.out.println(b3.ToDecimal());
        System.out.println(b4.ToDecimal());

        System.out.println();
        b1.print();
        b2.print();
        b3.print();
        b4.print();

        System.out.println();
        b1.multiply(b1).print();
        b2.multiply(b2).print();
        b3.multiply(b3).print();

        System.out.println();
        b1.multiply(b1, b2).print();
        b2.multiply(b2, b3).print();

        System.out.println();
        b4.add(b4).print();
        b3.add(b3).print();

        System.out.println();
        //doesnt't work!!!!!
        System.out.println(b1.getEntryNo());
        System.out.println(b4.getEntryNo());
        System.out.println(b7.getEntryNo());

        System.out.println();
        System.out.println("Next number is: " + Fraction.getNextFractionID());
        System.out.println("Total number is: " +  Fraction.getTotalNo());

        Fraction[] fractions = new Fraction[5];
        fractions[0] = b1;
        fractions[1] = b2;
        fractions[2] = b3;
        fractions[3] = b4;
        fractions[4] = b7;

        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i] + ", ");
        }

    }
}
