/*
 *
 * Java OOP-based calculator
 *
 */

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator math = new Calculator();

        math.a = 20;
        math.b = 0;

        //use methods Calculator class

        math.summ();
        math.substract();
        math.multiply();
        math.divide();
    }
}
