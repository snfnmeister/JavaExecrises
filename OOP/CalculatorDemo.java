/*
 *
 * Java OOP-based calculator
 *
 */

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator math = new Calculator();

        math.a = 20;
        math.b = 5;

        //use methods Calculator class

        System.out.println("a + b = " + math.summ());
        System.out.println("a - b = " + math.substract());
        System.out.println("a * b = " + math.multiply());
        System.out.println("a / b = " + math.divide());


    }
}
