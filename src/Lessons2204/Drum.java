package Lessons2204;

public class Drum extends Instrument{

    public Drum(int loudness) {
        super(loudness);
    }

    public int play() {
        System.out.println("Drums are hit at " );
        return loudness;
    }
}
