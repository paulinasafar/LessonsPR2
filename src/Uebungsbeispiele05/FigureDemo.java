package Uebungsbeispiele05;

public class FigureDemo {

    public static void main(String[] args) {


        Rectangle rect1 = new Rectangle(23.56, 43.11);
        Rectangle rect2 = new Rectangle(87.6, 12.89);
        Rectangle rect3 = new Rectangle(12.16, 58.1);
        Rectangle rect4 = new Rectangle(55.56, 141.11);

        Circle circ1 = new Circle(54.56);
        Circle circ2 = new Circle(1255.56);
        Circle circ3 = new Circle(785.56);

        Triangle tri1 = new Triangle(34.3, 56.54, 78.14);
        Triangle tri2 = new Triangle(458.3, 516.54, 8.1);
        Triangle tri3 = new Triangle(896.89, 28.54, 118.58);

        FigureManager array1 = new FigureManager();
        array1.add(circ1);
        array1.add(rect1);
        array1.add(rect2);
        array1.add(rect3);
        array1.add(rect4);
        array1.add(circ1);
        array1.add(circ2);
        array1.add(circ3);
        array1.add(tri2);
        array1.add(tri3);
        array1.add(rect3);
        array1.add(tri1);

        System.out.println(array1.toString());
        System.out.println("-----------------------------------------------");
        System.out.println(array1.getAverageAreaSize());
        System.out.println();
        System.out.println(array1.getMaxPerimeter());
        System.out.println();
        System.out.println(array1.getAreaBySizeCategories());

    }
}
