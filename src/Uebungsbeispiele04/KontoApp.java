package Uebungsbeispiele04;

public class KontoApp {

    public static void main(String[] args) {


        Konto konto1 = new Konto("JD");
        SparKonto spark1 = new SparKonto("JD");
        SparKonto spark2 = new SparKonto("MK");
        SparKonto spark3 = new SparKonto("UZ");
        GiroKonto girok1 = new GiroKonto("JD", 1500.00);
        GiroKonto girok2 = new GiroKonto("ZT", 500.00);
        GiroKonto girok3 = new GiroKonto("UZ", 1000.00);
        JugendGiroKonto jugend1 = new JugendGiroKonto("HG", 200.0, 50.00);
        JugendGiroKonto jugend2 = new JugendGiroKonto("SD", 500.0, 100.00);
        JugendGiroKonto jugend3 = new JugendGiroKonto("EW", 1000.0, 300.00);

        spark3.einzahlen(6521.45);
        System.out.println(spark3.auszahlen(1521.45));

        spark1.einzahlen(5000);
        System.out.println(spark1.auszahlen(6000));
        System.out.println();
        girok2.einzahlen(2500.00);
        System.out.println(girok2.auszahlen(2500.00));
        System.out.println();
        jugend1.einzahlen(1500.00);
        System.out.println(jugend1.auszahlen(60.00));

        jugend2.einzahlen(200.00);
        System.out.println(jugend2.auszahlen(98.00));

        System.out.println("-------------------------------------------------");

        konto1 = jugend3;
        konto1.einzahlen(5000);
        System.out.println(konto1.auszahlen(6500));
        System.out.println();

        girok3 = (GiroKonto) konto1;
        girok3.einzahlen(5000);
        System.out.println(girok3.getKontoStand());
        System.out.println(girok3.auszahlen(6500));

    }
}
