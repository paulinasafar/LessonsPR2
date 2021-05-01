package Uebungsbeispiele04;

public class Frog extends Animal {

    public Frog(String color, int countEyes) {
        super(color, countEyes);
    }


    @Override
    public void move() {
        System.out.println("Jump");
    }

    @Override
    public void makeNoise() {
        System.out.println("Kre Kre");
    }
}
