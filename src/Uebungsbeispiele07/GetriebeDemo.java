package Uebungsbeispiele07;

public class GetriebeDemo {

    public static void main(String[] args) {

        Getriebe getriebe = new Getriebe(-4, 4);


        try {
            getriebe.setGang(2);
        } catch (GangExistiertNichtException e) {
            e.printStackTrace();
        } catch (GetriebeSchutzException e) {
            e.printStackTrace();
        } finally {
            System.out.println(getriebe.getGang());
        }


        try {
            getriebe.gangErniedrigen();
        } catch (GangExistiertNichtException e) {
            e.printStackTrace();
        } finally {
            System.out.println(getriebe.getGang());
        }

        try {
            getriebe.gangErhoehen();
        } catch (GangExistiertNichtException e) {
            e.printStackTrace();
        } finally {
            System.out.println(getriebe.getGang());
        }

    }

}
