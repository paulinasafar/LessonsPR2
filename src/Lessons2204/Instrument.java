package Lessons2204;

public class Instrument {

    public int loudness;

    public Instrument(int loudness) {
        this.loudness = loudness;
    }
    public int play() {
        System.out.println("Instruments playing at ");
        return loudness;
    }



}
