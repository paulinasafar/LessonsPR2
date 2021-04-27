package Lessons2204;

import java.util.ArrayList;
import java.util.HashMap;

public class Orchestra {

    protected ArrayList<Instrument> orchestra;

    public Orchestra() {
        this.orchestra = new ArrayList<>();
    }

    public ArrayList<Instrument> addToArray(Instrument i) {
        orchestra.add(i);
        return orchestra;
    }

    public int playAll(ArrayList<Instrument> orchestra){
        int l = 0;
        for (Instrument i : orchestra) {
            l = l + i.play();
       }
        System.out.println("Total volume is: " + l);
        return l;
    }

    @Override
    public String toString() {
        return "Orchestra= " +
                "" + orchestra;
    }
}
