package Uebungsbeispiele01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Order {
    private int nrArticles;
    private int capacityOrder;
    private ArrayList<Article> articles;

    public Order(int capacityOrder) {
        this.nrArticles = 0;
        this.capacityOrder = capacityOrder;
        this.articles = new ArrayList<Article>(capacityOrder);
    }

    public int getNrArticles() {
        return nrArticles;
    }

//    public void setNrArticles(int nrArticles) {
//        this.nrArticles = nrArticles;
//    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

//    public void setCapacityOrder(int capacityOrder) {
//        this.capacityOrder = capacityOrder;
//    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void addArticle(Article a) {
            articles.add(a);
        }

    public int findMostExpensiveArticle(ArrayList<Article> articles) {
        int highestPrice = 0;
        for (int i = 0; i < articles.size() - 1; i++) {
            if (articles.get(i).getPrice() < articles.get(i+1).getPrice()) {
                highestPrice = i + 1;
            }
        }
        return highestPrice + 1;
    }

    public int findMostExpensiveOrderPosition(ArrayList<Article> articles) {
        int mostExpensiveOrder = 0;

        for (int i = 0; i < articles.size() - 1; i++) {
            if (articles.get(i).getPrice() * articles.get(i).getNumber() < articles.get(i+1).getPrice() * articles.get(i+1).getNumber()) {
                mostExpensiveOrder = i + 1;
            }
        }
        return mostExpensiveOrder + 1;
    }

    public double sumOrder(ArrayList<Article> articles) {
        double sum = 0.0;

        for (int i = 0; i < articles.size(); i++) {
            sum += (articles.get(i).getPrice() * articles.get(i).getNumber());
        }
        return sum;
    }

    public double calculateTax(ArrayList<Article> articles){
        double tax1 = 0.0;
        double totalTax = 0.0;
        for (int i = 0; i < articles.size(); i++) {
            if(articles.get(i).getPrice() < 20) {
                //tax1= 0;
                tax1 = (articles.get(i).getPrice() * 0.05) * articles.get(i).getNumber();
                totalTax += tax1;
            }else {
                //tax1 = 0;
                tax1 = (articles.get(i).getPrice() * 0.20) * articles.get(i).getNumber();
                totalTax += tax1;
            }
        }
    return totalTax;}

    public double sumOrderWithTax(ArrayList<Article> articles) {
        double sumOrderWithTax = sumOrder(articles) + calculateTax(articles);

        return sumOrderWithTax;
    }

//    private void increaseArray(ArrayList<Article> articles) {
//        articles.ensureCapacity(100);
//    }
//
//    public void getIncreasedArray(ArrayList<Article> articles){
//        increaseArray(articles);
//    }

    @Override
    public String toString() {
        return "Order:" + " Articles= " + articles;
    }
}
