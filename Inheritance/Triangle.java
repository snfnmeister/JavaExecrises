/*
 *
 * Using inheritance for getting class which describes Triangle form
 *
 */

public class Triangle extends TwoDShape {

    private String style;

    public Triangle(String style, double width, double height) { //subclass constructor
        this.style = style;
        setHeight(height); // initialize superclass variables thru set/get methods in subclass constructor
        setWidth(width);   // initialize superclass variables thru set/get methods in subclass constructor
    }

    double area() { //calculate Triangle area
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Triangle - " + style);
    }
}
