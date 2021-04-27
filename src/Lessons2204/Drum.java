package Lessons2204;

public class Drum extends Instrument{

    public Drum(int loudness) {
        super(loudness);
    }

@Override
    public int play() {
        System.out.println("Drums hitting " );
        return loudness;
    }

    @Override
    public String toString() {
        return "Drum{" +
                "loudness=" + loudness +
                '}';
    }
}
