package Lessons2204;

public class Dog {

    public String eyeColor;
    public int weight;

    public void bark() {
        System.out.println("Vau Vau");
    }


    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
