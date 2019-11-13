/*
 *
 * Make a calculator class with own methods (summ, substraction, divide, multiply);
 *
 */

public class Calculator {
    int a;
    int b;

    //summ method
    void summ() {
        System.out.println("summ is " + (a + b));
    }

    //substraction method
    void substract() {
        System.out.println("substraction is " + (a - b));
    }

    //divide method
    void divide() {
        if (b != 0) {
            System.out.println("divide is " + (a / b));
        } else {
            System.out.println("b must be greater then 0");
        }
    }

    //multiply method
    void multiply() {
        System.out.println("multiply is " + (a * b));
    }
}
