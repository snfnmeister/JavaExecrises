
/*
 * How Java works with output messages
 *
 */

public class SystemOut {

    public static void main(String args[]) {

        System.out.println("Hello World!");

        int a = 14;
        int b = 88;
        double c = (double) a / b;

        System.out.println(a + b);

        System.out.println("Variable a contains " + a);

        System.out.println("Variable c equal to = " + (double) a / b);

        System.out.println("Variable c equal to = " + c);

        System.out.println(c);

        System.out.print("c = ");
        System.out.println(c);


    }
}
