/*
 *
 * Example of using references to superclass/subclass objects in Inheritance
 *
 */

public class SupSubRef {
    public static void main(String[] args) {
        X x = new X(5);
        X x2;
        Y y = new Y(1, 2);
        x2 = x; //variables one type
        System.out.println("x2.a = " + x2.a);
        x2 = y; //variables one type - by Inheritance
        System.out.println("x2.a = " + x2.a);

        //now x2 is class Y
        x2.a = 15;
//        x2.i = 10; - don't work because variable i don't field of class Y

    }
}

