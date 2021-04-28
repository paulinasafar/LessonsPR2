package Lessons2204;

public class Dog implements Comparable<Dog>{

    public String eyeColor;
    public int weight;

    public Dog(String eyeColor, int weight) {
        this.eyeColor = eyeColor;
        this.weight = weight;
    }

    public void bark() {
        System.out.println("Vau Vau");
    }

    // we want to sort by weight
    @Override
    public int compareTo(Dog o) {
        if(this.weight < o.weight) {
            return -1;
        }
        if(this.weight > o.weight) {
            return 1;
        }
        //here we can assume that the weight is the same
        return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
