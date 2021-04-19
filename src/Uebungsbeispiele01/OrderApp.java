package Uebungsbeispiele01;

public class OrderApp {

    public static void main(String[] args) {

        Article a = new Article("Orange", 1, 2.22);
        Article b = new Article("Banana", 2, 1.59);
        Article c = new Article("Kiwi", 3, 2.12);
        Article d = new Article("Apple", 4, 1.28);
        Article e = new Article("Physallis", 5, 2.68);
        Article f = new Article("Ananas", 6, 2.98);
        Article g = new Article("Erdbeere", 7, 3.85);

        System.out.println(a.getName());
        a.setName("Himbeere");




    }
}
