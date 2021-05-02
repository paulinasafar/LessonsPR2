package Uebungsbeispiele04;

public class BundesLand extends Land{

        private double bruttoSozialProdukt;

    public BundesLand(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }

    @Override
    public double getbruttoSozialProdukt() {
        return bruttoSozialProdukt;
    }
}
