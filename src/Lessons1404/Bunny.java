package Lessons1404;

public class Bunny {
    private String name;
    private String favoriteFood;
    private int bID;
    private static int bunnyID = 1000;
    private Seasons birthSeason;


    //if we write at least one construtor, the default constructor no longer exists
    //this is a construktor without parameter
    //public Bunny() {
    //    favoriteFood = "carrots";
    //}

    //because we defined contructor with a parameter,
    // we can no longer use the default contructor without parameters.
//    public Bunny(String name) {
//    this.name = name;
//    this.favoriteFood = "carrots";
//    this.bID = bunnyID;
//    bunnyID += 1000;
//    birthSeason = Seasons.SUMMER;
//    }

    public Bunny(String name, String favoriteFood, Seasons s) {
        this.name = name;
        this.favoriteFood = favoriteFood;
        this.bID = bunnyID;
        this.birthSeason = s;
        bunnyID += 1000;
    }

    public int getbID(){
        return bID;
    }

    public int getNextBunnyID() {
        return bunnyID;
    }

    // we just want to use it internally, therefore private
    private void output() {
        System.out.println(name + " " + favoriteFood);
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        if (name != null) {
           this.name = name;
           output();
        }
    }

    public String getFavoriteFood(){
        return this.favoriteFood;
    }

    public void setFavoriteFood(String fav){
        this.favoriteFood = fav;
    }

    public void changeFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;

    }
    public void changeFavoriteFood() {
        favoriteFood = "carrots";
    }
    @Override
    public String toString() {
        return "Bunny " + name + " loves " + favoriteFood;
    }
}
