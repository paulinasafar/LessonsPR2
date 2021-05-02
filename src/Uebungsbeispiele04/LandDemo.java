package Uebungsbeispiele04;

public class LandDemo {

    public static void main(String[] args) {

        Bundesstaat bundesarray = new Bundesstaat();
        BundesLand steiermark = new BundesLand(1.55);
        BundesLand karnten = new BundesLand(1.45);

        bundesarray.addLand(steiermark);
        bundesarray.addLand(karnten);

        System.out.println(bundesarray.getbruttoSozialProdukt());

    }
}
