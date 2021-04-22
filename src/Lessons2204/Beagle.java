package Lessons2204;

public class Beagle extends Dog{

    public String favoriteFood;

    public Beagle(String fF) {
        favoriteFood = fF;
    }

    @Override
    public String toString() {
        return "Beagle{" +
                "favoriteFood='" + favoriteFood + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                ", weight=" + weight +
                '}';
    }
}
