package Lessons2204;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DogsApp {

    public static void main(String[] args) {
        // test a dog
        Dog dog1 = new Dog("brown", 1);
        Dog dog2 = new Dog("blue", 5);
        Dog dog3 = new Dog("brown", 3);
        Dog dog4 = new Dog("green", 3);
        dog1.eyeColor = "brown";
        dog1.weight = 10;
        dog1.bark();
        System.out.println(dog1);

        // test a beagle
//        Beagle b = new Beagle("tuna");
//        b.eyeColor = "blue";
//        b.weight = 12;
//        b.bark();
//        System.out.println(b);
      //Dog[] dogs1 = {new Dog("blue", 45), new Dog("green", 5)};

        Dog[] dogs = new Dog[4];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;
        dogs[3] = dog4;

        System.out.println(Arrays.toString(dogs));

        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));
        // same thing for lists (arraylists, linkedlists, ...)
        System.out.println();
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);

        System.out.println(dogList);
        Collections.sort((dogList));
        System.out.println(dogList);

    }

}
