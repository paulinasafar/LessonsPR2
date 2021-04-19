package Uebungsbeispiele01;

public class Article {

    private String name;
    private int number;
    private double price;

    public Article(String name, int number, double price) {
        this.name = name;
        this.number = number;
        this.price = price;
    }

        public String getName(){
            return name;
        }

        public void setName(String name) {
            if (name != null) {
                this.name = name;
                toString();
            }
        }


    public double findMostExpensiveArticle(Article[] articles) {
        double highestPrice = articles[0].price;

        for (int i = 0; i < articles.length-1; i++) {
                if(articles[i].price < articles[i+1].price) {
                    highestPrice = articles[i+1].price;
                }
            }
        return highestPrice + 1;}

//    public double findMostExpensiveOrderPosition(Article[] articles) {
//            double mostExpensive = articles[0].number * articles[0].price;
//        for (int i = 0; i < articles.length; i++) {
//            if((articles[i].number * articles[i].price) < (articles[i].number * articles[i].price) )
//        }
//
//
//    }



        @Override
    public String toString() {
        return "Article " + name + " with number"  + number + " and price: " + price;
        }

    }

