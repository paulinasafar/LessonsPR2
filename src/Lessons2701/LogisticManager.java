package Lessons2701;

import java.util.ArrayList;

public class LogisticManager {

    private ArrayList<Moveable> moveables;

    public LogisticManager() {
        this.moveables = new ArrayList<Moveable>();
    }

    public void addMoveables(Moveable m) {
        moveables.add(m);
    }

    public void moveAll() {
        for (Moveable element : moveables)
            element.move("Vienna");
    }

}
