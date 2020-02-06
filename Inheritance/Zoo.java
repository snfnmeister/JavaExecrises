/*
 *
 * Demonstration of working Inheritance in Java
 * @author  Igor I.
 * @version dated Dec 30, 2019
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

        System.out.print("Cats:\n" + catOne.getCatName() + ": ");
        catOne.showHar(); //using method (showHar) of superclass

        System.out.print(catTwo.getCatName() + ": ");
        catTwo.showHar();
        System.out.println();

        Doggo doggoOne = new Doggo("GafGafi4");
        Doggo doggoTwo = new Doggo("Mukhtar");


        doggoOne.bodySize = 200;
        doggoOne.tailSize = 80;
        doggoTwo.bodySize = 300;
        doggoTwo.tailSize = 100;

        System.out.print("Doggos:\n" + doggoOne.getDoggoName()+ ": ");
        doggoOne.showHar(); //showing characteristic of doggoOne (it is superclass method);
        System.out.print(doggoTwo.getDoggoName() + ": ");
        doggoTwo.showHar(); //using superclass method
        System.out.println();


    }
}
