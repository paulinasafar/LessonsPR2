package Uebungsbeispiele01;

import java.util.Arrays;

public class OrderApp {

    public static void main(String[] args) {

        Article a = new Article("Orange", 1, 2.22);
        Article b = new Article("Banana", 2, 1.59);
        Article c = new Article("Kiwi", 3, 4.12);
        Article d = new Article("Apple", 4, 1.28);
        Article e = new Article("Physallis", 5, 2.68);
        Article f = new Article("Ananas", 6, 8.98);
        Article g = new Article("Strawberry", 7, 3.85);
        Article h = new Article("Bread", 8, 4.23);
        Article i = new Article("Milk", 9, 3.18);
        Article j = new Article("Cheese", 10, 7.94);
        Article k = new Article("Torte", 11, 25.15);
        Article l = new Article("Meat", 12, 42.52);
        Article m = new Article("Wine", 13, 22.56);
        Article n = new Article("Steak", 10, 71.61);

        System.out.println(a.getName());
        a.setName("Blueberry");
        System.out.println(a.getName());
        System.out.println("-------------------------------------------------------");

        Order o1 = new Order(5);
        Order o2 = new Order(3);
        Order o3 = new Order(6);

        o1.addArticle(h);
        o1.addArticle(m);
        o1.addArticle(a);
        o1.addArticle(c);
        o1.addArticle(l);

        o2.addArticle(m);
        o2.addArticle(b);
        o2.addArticle(e);

        System.out.println(o1);
        System.out.println();
        System.out.println(o2);

    }
}
