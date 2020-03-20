/*
 *
 * Superclass TwoDShape which describe common parts of different figures
 * Re-writing with using override methods and dynamic dispatch
 *
 */

class TwoDShape {

    private double width;  //this variable have private access
    private double height; //this variable have private access
    private String name;
//    protected String style = "This is TwoDShape: ";

    TwoDShape() { //default constructor
        width = height = 0.0D;
        name = "none";
    }


    TwoDShape(double width, double height, String name) { //superclass constructor with params
        this.width = width;
        this.height = height;
        this.name = name;
    }

    TwoDShape(double x, String name) {   //superclass constructor where width equal to height (and to x)
        width = height = x;
        this.name = name;
    }

    TwoDShape(TwoDShape ob) { //make one object on basis another
        width = ob.width;
        height = ob.height;
        name = ob.name;
    }

    //getters and setters for private variables
    double getWidth() { //getter
        return width;
    }

    void setWidth(double width) { //setter
        this.width = width;

    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }

    String getName() { return name; } //getter for "name" field;

    void showDim() {
        System.out.println("Width and heights - " + width + "/" + height);
    } //method of superclass

    double area() {
        System.out.println("Method area() must be overriding");
        return 0.0;
    }
}
