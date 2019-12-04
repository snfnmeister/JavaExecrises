/*
 *
 * Demonstration of using static block in class
 *
 */

public class StaticBlock {

    static double x = 2;
    static double y;

//    static block using before constructor
    static {
        System.out.println("This using in da static block before constructor!");
        y = x * x;

    }

    StaticBlock () {
        System.out.println("Constructor!");
    }

}
