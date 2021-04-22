package Lessons2204;

public class EasterBunny extends Rabbit {

    public EasterBunny(String name) {
        super(name);
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
