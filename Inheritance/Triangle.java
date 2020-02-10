/*
*
* Using inheritance for getting class which describes Triangle form
*
*/

public class Triangle extends TwoDShape {

    String style;

    double area() { //calculate Triangle area
        return getWidth() * getHeight()/2;
    }

    void showStyle() {
        System.out.println("Triangle - " + style);
    }
}
