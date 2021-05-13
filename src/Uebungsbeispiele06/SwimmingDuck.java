package Uebungsbeispiele06;

public class SwimmingDuck extends Duck {

    private int weightWater;

    public SwimmingDuck(String name, int weight, int weightWater) {
        super(name, weight);
        this.weightWater = weightWater;
    }

    @Override
    public int getFullWeight() {
        int istGenauGenug = 0;
        istGenauGenug = getWeight() + weightWater;
        return istGenauGenug;
    }

    @Override
    public String makeNoise() {
        return "I am swimming!";
    }


    @Override
    public String toString() {
        return getName() + " " +  getFullWeight();
    }


}
