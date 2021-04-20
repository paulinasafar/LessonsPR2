package Uebungsbeispiele01;

import java.util.Arrays;

public class Order {
    private int nrArticles;
    private int capacityOrder;
    private Article[] articles;

    public Order(int nrArticles, int capacityOrder) {
        this.nrArticles = 0;
        this.capacityOrder = capacityOrder;
        this.articles = new Article[capacityOrder];
    }

    public int getNrArticles() {
        return nrArticles;
    }

    public void setNrArticles(int nrArticles) {
        this.nrArticles = nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

    public void setCapacityOrder(int capacityOrder) {
        this.capacityOrder = capacityOrder;
    }

    public Article[] getArticles() {
        return articles;
    }

    public void setArticles(Article[] articles) {
        this.articles = articles;
    }



    public double findMostExpensiveArticle(Article[] articles) {
        double highestPrice = articles[0].getPrice();

        for (int i = 0; i < articles.length-1; i++) {
            if(articles[i].getPrice() < articles[i+1].getPrice()) {
                highestPrice = articles[i+1].getPrice();
            }
        }
        return highestPrice + 1;}


    @Override
    public String toString() {
        return "Order{" +
                "nrArticles=" + nrArticles +
                ", capacityOrder=" + capacityOrder +
                ", articles=" + Arrays.toString(articles) +
                '}';
    }
}
