package Lessons2204;

//public class Beagle extends Dog{
public class Beagle {

    public String favoriteFood;

//    public Beagle(String fF) {
//        favoriteFood = fF;
//    }

    public void jump(int height) {
        System.out.println("Beagle jumps " + height + " cm high.");
    }


    public String toString() {
        return "Beagle: " +
                "favoriteFood: "+ favoriteFood;

    }
}
