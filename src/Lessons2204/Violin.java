package Lessons2204;

public class Violin extends Instrument {

    public Violin(int loudness) {
        super(loudness);
    }

@Override
    public int play() {
        System.out.println("Violin stringing " );
        return loudness;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "loudness=" + loudness +
                '}';
    }
}
