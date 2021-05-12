package Uebungsbeispiele06;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Duck implements Comparable<Duck> {

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public abstract int getFullWeight();
    public abstract String makeNoise();

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Duck d) {

       if(this.getFullWeight() < d.getWeight()) {
           return -1;
            }
       if(this.getFullWeight() > d.getWeight()) {
           return 1;
        }
       return 0;
    }

    @Override
    public String toString() {
        return "Duck = " + name + getFullWeight();
    }
}
