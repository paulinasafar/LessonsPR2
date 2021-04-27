package Lessons2701;

import Lessons2204.Instrument;

public class Bird extends Animal implements Fly {

    public Bird(String color) {
        super(color, 2);
    }

    @Override
    public void winkeWinke() {
        super.winkeWinke();
    }

    @Override
    public void walk() {
    }

    @Override
    public void makeNoise() {
    }

    @Override
    public void fly() {
        System.out.println("Fly through the sky");
    }
}
