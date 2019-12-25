/*
 *
 * Demonstration of working Inheritance in Java
 *
 */

public class Zoo {

    public static void main(String[] args) {

        Cat catOne = new Cat("Barsique");
        Cat catTwo = new Cat("Rigik");

        catOne.bodySize = 40;
        catOne.tailSize = 50;
        catTwo.bodySize = 80;
        catTwo.tailSize = 100;

        System.out.print(catOne.getCatName() + ": ");
        catOne.showHar(); //using method (showHar) of superclass

        System.out.print(catTwo.getCatName() + ": ");
        catTwo.showHar();

    }
}
