/*
 *
 * Example of using multiply Inheritance
 * Where ColorTriangle is subclass of Triangle which is subclass of TwoDShape
 * ColorTriangle <-Triangle <-TwoDShape
 *
 */

public class ColorTriangle extends Triangle {

    private String color;

    ColorTriangle(String color, String style, double width, double height) { //constructor of class
        super(style, width, height);
        this.color = color;
    }

    ColorTriangle(String color, double x) {
        super(x);
        this.color = color;
    }

    String getColor() {
        return color;
    }

    void showColor() {
        System.out.println("Color of triangle is - " + color);
    }

}
