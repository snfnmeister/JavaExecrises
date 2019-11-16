/*
 *
 * Make a calculator class with own methods (summ, substraction, divide, multiply);
 *
 */

public class Calculator {
    int a;
    int b;

    //summ method
    int summ() {
        return a + b;
    }

    //substraction method
    int substract() {
        return a - b;
    }

    //divide method
    int divide() {
        if (b != 0) {
            return a / b;
        } else {
            return 0;
        }
    }

    //multiply method
    int multiply() {
        return a * b;
    }
}
