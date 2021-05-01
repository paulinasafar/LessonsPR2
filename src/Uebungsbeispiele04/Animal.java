package Uebungsbeispiele04;

public class Animal {

    protected String color;
    protected int countEyes;


    public Animal(String color, int countEyes) {
        this.color = color;
        this.countEyes = countEyes;
    }

    public String getColor() {
        return color;
    }

    public int getCountEyes() {
        return countEyes;
    }

    public void move() {
        System.out.println("Move");
    }

    public void makeNoise() {
        System.out.println("Makes noise");
    }



    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", countEyes=" + countEyes +
                '}';
    }
}
