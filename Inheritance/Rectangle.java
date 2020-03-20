/*
 *
 * Using inheritance for getting class which describes Rectangle form
 *
 */

public class Rectangle extends TwoDShape {

    private String style; //field "name" in superclass

    //default constructor of subclass
    Rectangle() {
        super();
        style = "none";
    }

    //subclass constructor with 2 params
    Rectangle(double width, double height) { //subclass constructor
        super (width, height, "Rectangle");
        this.style = style;
    }

    //subclass constructor that used superclass constructor with 1 params
    Rectangle(double x) {
        super(x, "Rectangle");
        style ="This is square";
    }

    Rectangle(Rectangle ob) {
        super(ob); //use superclass constructor with objects of own class
        style = ob.style;
    }

    boolean isSquare() {
        if(getWidth() == getHeight()) return true;
        return false;
    }


    double area() { //override parent class method - calculate Rectangle area
        return getWidth() * getHeight();
    }

    void showStyle() {
        System.out.println("Triangle - " + style); //in subclass method using superclass variable thru "super" keyword
    }
}
