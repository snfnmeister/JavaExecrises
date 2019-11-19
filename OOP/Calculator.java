/*
 *
 * Make a calculator class with own methods (summ, substraction, divide, multiply);
 *
 */

public class Calculator {
//    int a;
//    int b;

    //methods with parameters
    //summ method
    int summ(int a, int b) {
        return a + b;
    }

    //substraction method
    int substract(int a, int b) {
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

    //multiply method
    int multiply(int a, int b) {
        return a * b;
    }
}
