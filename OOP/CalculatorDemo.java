/*
 *
 * Java OOP-based calculator
 *
 */

public class CalculatorDemo {

    public static void main(String[] args) {

        int x = 1;
        int y = 1000;

        Calculator math = new Calculator(20, 5);
        Calculator mathOne = new Calculator(x, y);

        //use methods of Calculator class
        System.out.println("a + b = " + math.summ());
        System.out.println("a - b = " + math.substract() + "\n");
        System.out.println("a * b = " + mathOne.multiply());
        System.out.println("a / b = " + mathOne.divide());

    }
}
