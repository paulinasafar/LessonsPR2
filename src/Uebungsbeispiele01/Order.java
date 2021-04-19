package Uebungsbeispiele01;

import java.util.Arrays;

public class Order {
    private int nrArticles = 0;
    private int capacityOrder;
    private Article[] articles = new Article[capacityOrder];

    public Order() {
        this.nrArticles = nrArticles;
        this.capacityOrder = capacityOrder;
        this.articles = articles;
    }

    public int getNrArticles() {
        return nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

//    public void addArticle(Article a) {
//        int i = 0;
//        articles[i++] = a;
//    }

    @Override
    public String toString() {
        return "The Order is: " + Arrays.deepToString(articles);
    }
}
