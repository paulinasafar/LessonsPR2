package Lessons1404;

public class Fraction {
    private int numerator;
    private int denominator;
    private int entryNo;
    private static int fractionID = 1;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.entryNo = fractionID;
        fractionID += 1;
    }

    public int getEntryNo() {
       return entryNo;
    }

    public static int getNextFractionID() {
        return fractionID;
    }

    public static int getTotalNo() {
        return fractionID -1;
        }


    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public double ToDecimal() {
        double decimal = 0.0;
        decimal = (double) this.numerator / this.denominator;
        decimal = Math.round(decimal * 100);
        decimal = decimal / 100;
        return decimal;
    }

    public void print() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public Fraction multiply(Fraction b2) {
        Fraction b8 = new Fraction(1,1);
        b8.numerator = b2.numerator * b2.numerator;
        b8.denominator = b2.denominator * b2.denominator;
        return b8;
    }

    public Fraction multiply(Fraction b2, Fraction b3) {
        Fraction b5 = new Fraction(1, 1);
        b5.numerator = b2.numerator * b2.numerator * b3.numerator;
        b5.denominator = b2.denominator * b2.denominator * b3.denominator;
        return b5;
    }

    public Fraction add(Fraction b2) {
        Fraction b6 = new Fraction(1,1);
        b6.numerator = b2.numerator + b2.numerator;
        b6.denominator = b2.denominator;
        return b6;
    }

    @Override
    public String toString(){
        return "Fraction " + numerator + "/" + denominator + " " + fractionID;
    }

//    @Override
//    public String toString() {
//        return "Bunny " + name + " loves " + favoriteFood;

   // }
}
