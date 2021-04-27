package Lessons2204;

public abstract class Instrument {

    protected int loudness;

    public Instrument(int loudness) {
        this.loudness = loudness;
    }

    public int getLoudness() {
        return loudness;
    }

    public void setLoudness(int loudness) {
        this.loudness = loudness;
    }

    public abstract int play();

    @Override
    public String toString() {
        return "Instrument{" +
                "loudness=" + loudness +
                '}';
    }
}
