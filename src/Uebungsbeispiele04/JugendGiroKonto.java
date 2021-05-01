package Uebungsbeispiele04;

public class JugendGiroKonto extends GiroKonto {

    protected double buchungsLimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungsLimit) {
        super(inhaber, limit);
        this.buchungsLimit = buchungsLimit;
    }

    @Override
    public double einzahlen(double wert) {
        return super.einzahlen(wert);
    }

    @Override
    public double auszahlen(double wert) {
        if (wert > buchungsLimit) {
            return kontoStand;
        } else {
            if ((kontoStand - wert) < (limit * -1)) {
                return kontoStand;
            } else {
                kontoStand -= wert;
                return kontoStand;
            }
        }
    }

    @Override
    public double getKontoStand() {
        return super.getKontoStand();
    }
}
