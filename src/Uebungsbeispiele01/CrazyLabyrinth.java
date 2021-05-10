package Uebungsbeispiele01;

public class CrazyLabyrinth {


    public boolean checkPathConsistency(LabyrinthTile[] path) {
        boolean isPathConsistent = false;

        for (int i = 0; i < path.length - 1; i++) {
            if ((path[i].getExit().toString().equals("DOWN") && path[i + 1].getEntry().toString().equals("UP")) ||
                (path[i].getExit().toString().equals("UP") && path[i + 1].getEntry().toString().equals("DOWN")) ||
                (path[i].getExit().toString().equals("LEFT") && path[i + 1].getEntry().toString().equals("RIGHT")) ||
                (path[i].getExit().toString().equals("RIGHT") && path[i + 1].getEntry().toString().equals("LEFT"))) {
                               isPathConsistent = true;
            }
        }
        return isPathConsistent;}
}