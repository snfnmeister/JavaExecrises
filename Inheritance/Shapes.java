/*
*
* Class for using Shapes
*
*/

public class Shapes {

    public static void main(String[] args) {
        Triangle t1 = new Triangle(); //use default constructor
        Triangle t2 = new Triangle();

        t1.setWidth(10); //set width for triangle t1
        t1.setHeight(5); //set height for triangle t1
        t1.style = "Painted over";

        t2.setWidth(20); //set width for triangle t1
        t2.setHeight(15); //set height for triangle t1
        t2.style = "Contour";

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
