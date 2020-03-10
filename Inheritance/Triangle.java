/*
 *
 * Using inheritance for getting class which describes Triangle form
 *
 */

public class Triangle extends TwoDShape {

    private String style;

    //default constructor of subclass
    Triangle() {
        super();
        style = "none";
    }

    //subclass constructor with 2 params
    Triangle(String style, double width, double height) { //subclass constructor
        super (width, height, "Triangle");
        this.style = style;
    }

    //subclass constructor that used superclass constructor with 1 params
    Triangle (double x) {
        super(x, "Triangle");
        style ="Triangle with equal width and height";
    }

    Triangle(Triangle ob) {
        super(ob); //use superclass constructor with objects of own class
        style = ob.style;
    }


    double area() { //calculate Triangle area
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Triangle - " + style); //in subclass method using superclass variable thru "super" keyword
    }
}
