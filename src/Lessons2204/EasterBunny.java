package Lessons2204;

public class EasterBunny extends Rabbit {

    public EasterBunny(String name) {
        super(name);
        hopp(1); // would call my own hopp method in line 14
        super.hopp(1); // would call implementation in base class (Rabbit)
    }

    public void hidesEggs(int howManyEggs) {
        System.out.println("The EasterBunny hid " + howManyEggs + " gifts.");
    }
    @Override
    public void hopp(int howMany) {
        System.out.println("The EasterBunny " + name + " hops " + howMany + " times.");
    }

    @Override
    public String toString() {
        return "EasterBunny: " +
                name;
    }
}
