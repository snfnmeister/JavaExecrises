/*
 *
 * Make a calculator class with own methods (summ, substraction, divide, multiply);
 *
 */

public class Calculator {
    int a;
    int b;

    //constructor for Calculator class
    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    //summ method
    int summ() {
        return a + b;
    }

    //substraction method
    int substract() {
        return a - b;
    }

    //divide method
    float divide() {
        if (b != 0) {
            return (float) a / b;
        } else {
            return 0;
        }
    }

    //multiply method
    int multiply() {
        return a * b;
    }
}
