/*
 *
 * Superclass TwoDShape which describe common parts of different figures
 *
 */

class TwoDShape {

    private double width;  //this variable have private access
    private double height; //this variable have private access
    protected String style = "This is TwoDShape: ";

    TwoDShape() { //default constructor
        width = height = 0.0D;
    }


    TwoDShape(double width, double height) { //superclass constructor with params
        this.width = width;
        this.height = height;
    }

    TwoDShape (double x) {   //superclass constructor where width equal to height (and to x)
        width = height = x;
    }

    TwoDShape(TwoDShape ob) { //make one object on basis another
        width = ob.width;
        height = ob.height;
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

    void showDim() {
        System.out.println("Width and heights - " + width + "/" + height);
    } //method of superclass
}
