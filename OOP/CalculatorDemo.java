/*
 *
 * Java OOP-based calculator
 *
 */

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator math = new Calculator();

        int a = 20;
        int b = 5;

        //use methods Calculator class

        System.out.println("a + b = " + math.summ(a, b));
        System.out.println("a - b = " + math.substract(20, 15));
        System.out.println("a * b = " + math.multiply(a, 0));
        System.out.println("a / b = " + math.divide(a, 10));


    }
}
