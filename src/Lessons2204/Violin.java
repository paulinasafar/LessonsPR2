package Lessons2204;

public class Violin extends Instrument {

    public Violin(int loudness) {
        super(loudness);
    }
    public int play() {
        System.out.println("Violin stringing at " );
        return loudness;
    }

}
