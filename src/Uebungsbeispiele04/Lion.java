package Uebungsbeispiele04;

public class Lion extends Animal {

    public Lion(String color, int countEyes) {
        super(color, countEyes);
    }


    @Override
    public void move(){
        System.out.println("Stealthily jumps");
    }
    @Override
    public void makeNoise() {
        System.out.println("Grrrrrr");
    }

    public void roar(){
        System.out.println("Rooooaaaarr");
    }


}
