package Uebungsbeispiele04;

public class Konto {
    protected String inhaber;
    protected double kontoStand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontoStand = 0;
    }

    public double einzahlen(double wert) {
            kontoStand += wert;
    return kontoStand;}

    public double auszahlen(double wert) {
        kontoStand -= wert;
    return kontoStand;}

    public double getKontoStand() {
        return kontoStand;
    }
}
