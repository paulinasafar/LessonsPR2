package Lessons2204;

import java.util.ArrayList;

public class BunnyPen {

    public ArrayList<Rabbit> rabbitpen;

    public BunnyPen() {
        this.rabbitpen = new ArrayList<Rabbit>();

    }

    public void addRabbits(Rabbit r) {
        rabbitpen.add(r);
    }

    public void hophop() {
        for (Rabbit r : rabbitpen) {
            r.hopp(10);
        }
    }
}
