package Uebungsbeispiele04;

public class Dog extends Animal {

    public Dog(String color, int countEyes) {
        super(color, countEyes);
    }

    @Override
    public void move() {
        System.out.println("Runs");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark Bark");
    }


}
