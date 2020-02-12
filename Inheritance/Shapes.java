/*
*
* Class for using Shapes
*
*/

public class Shapes {

    public static void main(String[] args) {
        //init Triangles with diff constructors
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle("Painted over", 10,5);
        Triangle t3 = new Triangle(15);

        System.out.println("Triangle t1 info: ");
        t1.showStyle();
        t1.showDim();
        System.out.println("Area - " + t1.area() + "\n");

        System.out.println("Triangle t2 info: ");
        t2.showStyle();
        t2.showDim();
        System.out.println("Area - " + t2.area() + "\n");

        System.out.println("Triangle t3 info: ");
        t3.showStyle();
        t3.showDim();
        System.out.println("Area - " + t3.area() + "\n");

    }
}
