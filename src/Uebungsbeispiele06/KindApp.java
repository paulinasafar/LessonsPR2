package Uebungsbeispiele06;


public class KindApp {

    public static void main(String[] args) {

        Kind k1 = new Kind ("Andrea", "Maier", 7);
        Kind k2 = new Kind ("Sebastian", "Maier", 9);
        Kind k3 = new Kind ("Martina", "Weiss", 8);
        Kind k4 = new Kind ("Laura", "Schwarz", 6);
        Kind k5 = new Kind ("Franz", "Gelb", 9);

        Kindergarten garten1 = new Kindergarten("Sonnenblumen");
        garten1.addKind(k1);
        garten1.addKind(k2);
        garten1.addKind(k3);
        garten1.addKind(k4);
        garten1.addKind(k5);

        System.out.println(garten1);


        }

    }

