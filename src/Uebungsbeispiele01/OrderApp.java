package Uebungsbeispiele01;

import java.util.Arrays;

public class OrderApp {

    public static void main(String[] args) {

        Article a = new Article("Orange", 10, 2.22);
        Article b = new Article("Banana", 2, 1.59);
        Article c = new Article("Kiwi", 13, 4.12);
        Article d = new Article("Apple", 5, 1.28);
        Article e = new Article("Physallis", 7, 2.68);
        Article f = new Article("Ananas", 6, 8.98);
        Article g = new Article("Strawberry", 7, 3.85);
        Article h = new Article("Bread", 8, 4.23);
        Article i = new Article("Milk", 9, 3.18);
        Article j = new Article("Cheese", 4, 7.94);
        Article k = new Article("Torte", 1, 25.15);
        Article l = new Article("Meat", 3, 42.52);
        Article m = new Article("Wine", 2, 22.56);
        Article n = new Article("Steak", 4, 71.61);

        System.out.println(a.getName());
        a.setName("Blueberry");
        System.out.println(a.getName());
        System.out.println("-------------------------------------------------------");

        Order o1 = new Order(3);
        Order o2 = new Order(3);
        Order o3 = new Order(6);

        o1.addArticle(a);
        o1.addArticle(m);
        o1.addArticle(h);
        o1.addArticle(e);
        o1.addArticle(c);

        o2.addArticle(b);
        o2.addArticle(k);
        o2.addArticle(l);

        System.out.println(o1);
        System.out.println(o1.getCapacityOrder());
        System.out.println();
        System.out.println(o2);
        System.out.println(o2.getCapacityOrder());
        System.out.println();


        System.out.println("-------------------------------------------------------");

        //System.out.println(o1.getNrArticles());
        System.out.println("Calculate Tax: " + o2.calculateTax(o2.getArticles()));
        System.out.println("Sum of Order: " + o2.sumOrder(o2.getArticles()));
        System.out.println("Sum with Tax: " + o2.sumOrderWithTax(o2.getArticles()));
        System.out.println("Most expensive position: " + o2.findMostExpensiveOrderPosition(o2.getArticles()));
        System.out.println("Most expensive article: " + o2.findMostExpensiveArticle(o2.getArticles()));




    }
}
