package Lessons2204;

public class DogsApp {

    public static void main(String[] args) {
        // test a dog
        Dog d = new Dog();
        d.eyeColor = "brown";
        d.weight = 10;
        d.bark();
        System.out.println(d);

        // test a beagle
        Beagle b = new Beagle("tuna");
        b.eyeColor = "blue";
        b.weight = 12;
        b.bark();
        System.out.println(b);


    }

}
