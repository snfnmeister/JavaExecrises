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
        super (width, height);
        this.style = style;
    }

    //subclass constructor that used superclass constructor with 1 params
    Triangle (double x) {
        super(x);
        style ="Triangle with equal width and height";
    }

    double area() { //calculate Triangle area
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println(super.style + "Triangle - " + style); //in subclass method using superclass variable thru "super" keyword
    }
}
