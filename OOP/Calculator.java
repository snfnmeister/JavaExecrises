/*
 *
 * Make a calculator class with own methods (summ, subtraction, divide, multiply);
 *
 */

class Calculator {
    private int a;
    private int b;
    private double c;
    private double d;
    static int counter;

    //constructor for Calculator class
    Calculator(int a, int b) {
        this.a = a;
        this.b = b;
        counter++;
    }

    Calculator(double c, double d) {
        this.c = c;
        this.d = d;
        counter++;
    }

    void getIntData() {
        System.out.println("a = " + a + "\nb = " + b);
    }

    void getDoubleData() {
        System.out.println("c = " + c + "\nd = " + d);
    }


    //summ method
    int summ(int a, int b) { //all other not float data types will typecasts to int
        return a + b;
    }

    double summ(double a, double b) { //float data will cast to double
        return a + b;
    }


    //substraction method
    int substract(int a, int b) {
        return a - b;
    }

    double substract(double a, double b) {
        return a - b;
    }

    //divide method
    int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    //divide method
    double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    //multiply method
    int multiply(int a, int b) {
        return a * b;
    }

    //multiply method
    double multiply(double a, double b) {
        return a * b;
    }
}

