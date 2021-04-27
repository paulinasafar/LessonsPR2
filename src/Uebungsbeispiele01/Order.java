package Uebungsbeispiele01;

import java.util.Arrays;

public class Order {
    private int nrArticles;
    private int capacityOrder;
    private Article[] order;

    public Order(int capacityOrder) {
        this.nrArticles = 0;
        this.capacityOrder = capacityOrder;
        this.order = new Article[capacityOrder];
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
        return order;
    }

    public void setArticles(Article[] articles) {
        this.order = articles;
    }

    public void addArticle(Article a) {
        for (int i = 0; i < order.length; i++) {
            if (order[i] != String){
                order[i] = a;
            }
        }
    }

    public int findMostExpensiveArticle(Article[] articles) {
        int highestPrice = 0;

        for (int i = 0; i < articles.length - 1; i++) {
            if (articles[i].getPrice() < articles[i + 1].getPrice()) {
                highestPrice = i + 1;
            }
        }
        return highestPrice + 1;
    }

    public int findMostExpensiveOrderPosition(Article[] order) {
        int mostExpensiveOrder = 0;

        for (int i = 0; i < order.length - 1; i++) {
            if (order[i].getPrice() * order[i].getNumber() < order[i + 1].getPrice() * order[i + 1].getNumber()) {
                mostExpensiveOrder = i + 1;
            }
        }
        return mostExpensiveOrder + 1;
    }

    public double sumOrder(Article[] order) {
        double sum = 0.0;

        for (int i = 0; i < order.length; i++) {
            sum += (order[i].getPrice() * order[i].getNumber());
        }
        return sum;
    }

    public double calculateTax(Article[] order){
        double tax1 = 0.0;
        double totalTax = 0.0;
        for (int i = 0; i < order.length; i++) {
            if(order[i].getPrice() < 20) {
                tax1 = (order[i].getPrice() * 0.05) * order[i].getNumber();
                totalTax += tax1;
            }else {
                tax1 = (order[i].getPrice() * 0.20) * order[i].getNumber();
                totalTax += tax1;
            }
        }
    return totalTax;}

    public double sumOrderWithTax(Article[] order) {
        double sumOrderWithTax = sumOrder(order) + calculateTax(order);
    return sumOrderWithTax;}

    @Override
    public String toString() {
        return "Order: " + Arrays.toString(order);
    }
}
