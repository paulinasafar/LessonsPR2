package Uebungsbeispiele04;

public class AnimalDemo {
    public static void main(String[] args) {

        Animal animal1 = new Animal("white", 5);
        Frog quaxi = new Frog("green", 4);
        Lion simba = new Lion("brown", 2);
        Cat kitKat = new Cat("black", 2);
        Dog boris = new Dog("black", 2);

        System.out.println("Frog Quaxi");
        quaxi.move();
        quaxi.makeNoise();
        quaxi.catchFly();

        Animal quaxiAsAnimal = quaxi;
        System.out.println("\nAnimal Quaxi");
        quaxiAsAnimal.move();
        quaxiAsAnimal.makeNoise();

        Frog quaxi2 = (Frog) quaxiAsAnimal;
        System.out.println("\nFrog Quaxi Again");
        quaxi2.move();
        quaxi2.makeNoise();
        quaxi2.catchFly();

        System.out.println("\nLion Simba");
        simba.move();
        simba.makeNoise();
        simba.roar();
        Animal lionKing = simba;
        System.out.println("\nAnimal Simba");
        lionKing.move();
        lionKing.makeNoise();

        Nature nature1 = new Nature();
        nature1.addAnimal(quaxi);
        nature1.addAnimal(quaxiAsAnimal);
        nature1.addAnimal(quaxi2);
        nature1.addAnimal(lionKing);
        nature1.addAnimal(kitKat);
        nature1.addAnimal(animal1);
        nature1.addAnimal(simba);
        nature1.addAnimal(boris);

        System.out.println("Brown: " + nature1.countColor("brown"));
        System.out.println("Black: " + nature1.countColor("black"));
        System.out.println("Tabby: " + nature1.countColor("tabby"));
        System.out.println("White: " + nature1.countColor("white"));

        System.out.println();
        System.out.println(nature1.totalEyes() + " total number of eyes");
        System.out.println(nature1.averageEyes() + " average number of eyes");
        System.out.println();
        System.out.println(nature1.toString());


    }
}
