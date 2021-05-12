package Uebungsbeispiele06;

public class FlyingDuck extends Duck {

    private int weightSprings;

    public FlyingDuck(String name, int weight, int weightSprings) {
        super(name, weight);
        this.weightSprings = weightSprings;
    }

    @Override
    public int getFullWeight() {
        int istGenauGenug = 0;
        istGenauGenug = getWeight() + weightSprings;
        return istGenauGenug;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public String toString() {
        return "FlyingDuck = " + getFullWeight();
    }


}
