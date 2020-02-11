/*
*
* Class for using Shapes
*
*/

public class Shapes {

    public static void main(String[] args) {
        Triangle t1 = new Triangle("Painted Over", 10,5); //use subclass constructor
        Triangle t2 = new Triangle("Contour", 20,15);     //use subclass constructor

        System.out.println("Triangle t1 info: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area() + "\n");

        System.out.println("Triangle t2 info: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area() + "\n");

    }
}
