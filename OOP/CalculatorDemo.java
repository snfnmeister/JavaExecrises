/*
 *
 * Java OOP-based calculator
 *
 */

public class CalculatorDemo {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;
        double c = 13.37D;
        double d = 14.88D;

        Calculator math = new Calculator(x, y);
        Calculator mathOne = new Calculator(c, d);
//        Calculator mathTwo = new Calculator(1, 2);
//        Calculator mathFour = new Calculator(3, 4);
        math.getIntData();
        mathOne.getDoubleData();
        System.out.println("Created Calculator objects: " + Calculator.counter); //static variable of Calculator class

        //use methods of Calculator class

        System.out.println("SUMM\nInteger (a + b) = " + math.summ(x, y)); //its truly integer?
        System.out.println("Double (a + b) = " + math.summ(c, d));

        System.out.println("SUBSTRACT\nInteger (a - b) = " + math.substract(x, y));
        System.out.println("Double (a - b) = " + math.substract(c, d));

        System.out.println("MULTIPLY\nInteger (a * b) = " + mathOne.multiply(x, y));
        System.out.println("Double (a * b) = " + mathOne.multiply(c, d));

        System.out.println("DIVIDE\nInteger (a / b) = " + mathOne.divide(x, y));
        System.out.println("Double (a / b) = " + mathOne.divide(c, d));

        //        System.out.println("Integer ('A' + 'B') = " + math.summ('A','B')); //char will autocast to int


    }
}
