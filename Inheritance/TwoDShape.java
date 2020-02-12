/*
 *
 * Superclass TwoDShape which describe common parts of different figures
 *
 */

class TwoDShape {

    private double width;  //this variable have private access
    private double height; //this variable have private access



    TwoDShape(double width, double height) { //superclass constructor
        this.width = width;
        this.height = height;
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
