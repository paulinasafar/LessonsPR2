package Lessons2204;

public class XmasBunny extends Rabbit{


    public XmasBunny(String name) {
        super(name);
        // here event. initialisings code for the Easterrabbit
    }

    public void shareGifts(int howManyGifts) {
        System.out.println("The XmasBunny shared " + howManyGifts + " gifts.");
    }

    @Override
    public void hopp(int howMany) {
        System.out.println("The XmasBunny " + name + " hops " + howMany + " times.");
    }

    @Override
    public String toString() {
        return "XmasBunny: " +
                name;
    }
}
