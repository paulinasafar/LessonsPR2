package Lessons2204;

public class Piano extends Instrument {

    public Piano(int loudness) {
        super(loudness);
    }

    public int play() {
        System.out.println("Piano resonating at " );
        return loudness;
    }
}
