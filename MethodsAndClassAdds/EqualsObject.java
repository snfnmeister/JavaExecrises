/*
 *
 * Demonstration of working with object in methods parameters
 *
 */

public class EqualsObject {

    public static void main(String[] args) {

        Block ob1 = new Block(10, 10, 10);
        Block ob2 = new Block(20, 5, 10);
        Block ob3 = new Block(100, 10, 1);

        System.out.println("sizes of ob1 equals to sizes of ob2: " + ob1.sameBlock(ob2));
        System.out.println("sizes of ob1 equals to sizes of ob3: " + ob1.sameBlock(ob3));
        System.out.println("volumes of ob1 equals to volume of ob2: " + ob1.sameVolume(ob2));
        System.out.println("volumes of ob1 equals to volume of ob3: " + ob1.sameVolume(ob3));


    }
}
