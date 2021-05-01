package Uebungsbeispiele04;

public class Cat extends Animal {

    public Cat(String color, int countEyes) {
        super(color, countEyes);
    }


    @Override
    public void move() {
        System.out.println("Purs");
    }

    @Override
    public void makeNoise() {
        System.out.println("Miiaaooooww");
    }


}
