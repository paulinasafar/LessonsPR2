package Uebungsbeispiele01;

public class CrazyLabyrinthApp {

    public static void main(String[] args) {

        LabyrinthTile tile1 = new LabyrinthTile(Direction.DOWN, Direction.RIGHT);
        LabyrinthTile tile2 = new LabyrinthTile(Direction.LEFT, Direction.RIGHT);
        LabyrinthTile tile3 = new LabyrinthTile(Direction.LEFT, Direction.DOWN);
        LabyrinthTile tile4 = new LabyrinthTile(Direction.DOWN, Direction.LEFT);
        LabyrinthTile tile5 = new LabyrinthTile(Direction.RIGHT, Direction.UP);


        LabyrinthTile[] path1 = new LabyrinthTile[5];
        path1[0] = tile1;
        path1[1] = tile2;
        path1[2] = tile3;
        path1[3] = tile4;
        path1[4] = tile5;

        CrazyLabyrinth lab1 = new CrazyLabyrinth();
        System.out.println(lab1.checkPathConsistency(path1));






    }
}
