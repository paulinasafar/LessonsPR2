package Uebungsbeispiele01;

public class CrazyLabyrinth {


    public boolean checkPathConsistency(LabyrinthTile[] path) {
        boolean isPathConsistent = true;

        for (int i = 0; i < path.length - 1; i++) {

            if ((path[i].getExit() == Direction.DOWN && path[i+1].getEntry() == Direction.LEFT) ||
                (path[i].getExit() == Direction.DOWN && path[i+1].getEntry() == Direction.RIGHT) ||
                (path[i].getExit() == Direction.UP && path[i+1].getEntry() == Direction.LEFT) ||
                (path[i].getExit() == Direction.UP && path[i+1].getEntry() == Direction.RIGHT) ||
                (path[i].getExit() == Direction.LEFT && path[i+1].getEntry() == Direction.UP) ||
                (path[i].getExit() == Direction.LEFT && path[i+1].getEntry() == Direction.DOWN) ||
                (path[i].getExit() == Direction.RIGHT && path[i+1].getEntry() == Direction.UP) ||
                (path[i].getExit() == Direction.RIGHT && path[i+1].getEntry() == Direction.DOWN)) {
             isPathConsistent = false;
            }
        }
        return isPathConsistent;}
}