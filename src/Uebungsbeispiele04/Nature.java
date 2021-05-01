package Uebungsbeispiele04;

import java.util.ArrayList;

public class Nature {

    protected ArrayList<Animal> nature;

    public Nature() {
        this.nature = new ArrayList<>();
    }

    public void addAnimal(Animal a) {
        nature.add(a);
    }

    public int countColor(String color){
        int counter = 0;
        for (Animal a : nature) {
            if(a.getColor().equals(color)) {
                counter++;
            }
        }
    return counter;}

    public int totalEyes() {
        int total = 0;
        for (Animal a : nature) {
            total += a.getCountEyes();
        }

    return total;}

    public double averageEyes() {
        double sum = 0;
        int counter = 0;

        for (Animal a : nature) {
            sum += a.getCountEyes();
            counter++;
        }
    return sum / counter;}

    @Override
    public String toString() {
        return "Nature{" +
                "nature=" + nature +
                '}';
    }
}
