package Uebungsbeispiele07;

public class GetriebeDemo {

    public static void main(String[] args) {

        Getriebe getriebe = new Getriebe(-4, 4);

        try {
            getriebe.setGang(3);
        } catch (GangExistiertNichtException e) {
            e.printStackTrace();
        }

        System.out.println("\nCurrent gear is: " + getriebe.getGang());

        try {
            getriebe.gangErhoehen(-2);
        } catch (GangExistiertNichtException e) {
            e.printStackTrace();
        } catch (GetriebeSchutzException e) {
            e.printStackTrace();
        }finally {
            System.out.println("\nCurrent gear is: " + getriebe.getGang());
        }

        try {
            getriebe.gangErniedrigen(2);
        } catch (GangExistiertNichtException e) {
            e.printStackTrace();
        } catch (GetriebeSchutzException e) {
            e.printStackTrace();
        } finally {
            System.out.println("\nCurrent gear is: " + getriebe.getGang());
        }

    }

}
