package Lessons2204;

public class EasterBunny extends Rabbit {

    public EasterBunny(String name) {
        super(name);
    }

    public void hidesGifts(int howManyGifts) {
        System.out.println("The EasterBunny hid " + howManyGifts + " gifts.");
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
