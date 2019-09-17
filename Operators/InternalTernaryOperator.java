/*
 *
 * Replaces if-else structure by internal ternary operator
 *
 */
public class InternalTernaryOperator {

    public static void main(String[] args) {
        int a;
        int b = 10;
        int c = 20;

        //if (b > 15)
        //    if (c < 10) {
        //        a = 0;
        //    }
        //    else {
        //        a = -1;
        //    }
        //else {
        //    a = 1;
        //

        a = b > 5 ? c < 30 ? 0 : -1 : 1; //internal ternary operator
        System.out.println(a);


    }
}
