package Lessons2204;

public class Guitar extends Instrument {

    public Guitar(int loudness) {
        super(loudness);
    }

    public int play() {
        System.out.println("Guitar strumming at " );
        return loudness;
    }

}
