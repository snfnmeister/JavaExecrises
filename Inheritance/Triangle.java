/*
 *
 * Using inheritance for getting class which describes Triangle form
 *
 */

public class Triangle extends TwoDShape {

    private String style;

    Triangle(String style, double width, double height) { //subclass constructor
        super (width, height); //must be first statement in subclass constructor
        this.style = style;
    }

    double area() { //calculate Triangle area
        return (getWidth() * getHeight()) / 2;
    }

    void showStyle() {
        System.out.println("Triangle - " + style);
    }
}
