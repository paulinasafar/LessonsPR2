package Uebungsbeispiele04;

import java.util.ArrayList;

public class Bundesstaat extends Land{

    private ArrayList<Land> laender = new ArrayList<>();

    public Bundesstaat() {
        //this.bruttoSozialProdukt = bruttoSozialProdukt;
        this.laender = laender;
    }

    public void addLand(Land l) {
        laender.add(l);
    }

    @Override
    public double getbruttoSozialProdukt() {
        double sum = 0.0;
       for (int i = 0; i < laender.size(); i++) {
            sum += laender.get(i).getbruttoSozialProdukt();
        }
        return sum;
    }
}
