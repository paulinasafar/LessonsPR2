package Uebungsbeispiele04;

public class GiroKonto extends Konto{

    protected double limit;

    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit = limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public double einzahlen(double wert) {
        return super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {

        if((kontoStand - wert) < (limit * -1)) {
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
