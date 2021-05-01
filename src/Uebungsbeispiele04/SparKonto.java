package Uebungsbeispiele04;

public class SparKonto extends Konto{

    public SparKonto(String inhaber) {
        super(inhaber);
    }


    @Override
    public double einzahlen(double wert) {
        return super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if((kontoStand - wert) < 0) {
            return kontoStand;
        } else {
            kontoStand -= wert;
            return kontoStand;
        }
    }

    @Override
    public double getKontoStand() {
        return super.getKontoStand();
    }
}

