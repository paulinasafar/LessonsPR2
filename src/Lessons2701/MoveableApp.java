package Lessons2701;

public class MoveableApp {

    public static void main(String[] args) {

        Car car1 = new Car("VW", "blue", 5000);
        Car car2 = new Car("BMW", "cannary yellow", 6000);
        Car car3 = new Car("Porsche", "fire red", 7000);

        Shirt shirt1 = new Shirt("Ralph Laurent", 38, "white");
        Shirt shirt2 = new Shirt("Levis", 36, "lilac");
        Shirt shirt3 = new Shirt("Tommy Hilfiger", 34, "rose");

        LogisticManager move1 = new LogisticManager();
        LogisticManager move2 = new LogisticManager();

        move1.addMoveables(car1);
        move1.addMoveables(car3);
        move1.addMoveables(shirt1);
        move1.addMoveables(shirt3);

        shirt1.move("Graz");
        System.out.println("--------------------------------");

        move1.moveAll();

        System.out.println("--------------------------------");

        move2.addMoveables(shirt2);
        move2.addMoveables(shirt3);
        move2.addMoveables(shirt2);

        move2.moveAll();

    }
    public static void hello(){
        System.out.println("Hello");
    }
}
