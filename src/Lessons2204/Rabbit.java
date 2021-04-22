package Lessons2204;

public class Rabbit {

    protected String name;

    public Rabbit(String name) {
        this.name = name;
    }

    public void sleep(int howLong) {

        System.out.println("The Rabbit " + name + " sleeps for " + howLong + " hours.");
    }

    public void hopp(int howMany){

        System.out.println("The Rabbit " + name + " hops " + howMany + " times.");
        }

        public void eats(String favFood) {
         System.out.println("The Rabbit " + name + " likes to eat " + favFood + " the most.");
        }



    }

