/*
 *
 * Java conditional operators: if, if-else
 *
 * ---
 * if (if-else) operator syntax:
 *                     if (condition) operator;
 *
 *                     --
 *
 *                     if (condition) operator;
 *                     else operator;
 *
 *                     --
 *
 *                     if (condition) {
 *                        operator1, operator2..operatorN
 *                     }
 *                     else {
 *                        operator1, operator2..operatorN
 *                     }
 *
 *                     --
 *
 *                     if (condition)
 *                         operator1;
 *                     else if (condition)
 *                         operator2;
 *                     else if (condition)
 *                         operator3;
 *
 */

public class ConditionalOperators {

    public static void main(String[] args) {
        int a = 10;
        if (a > 0) System.out.println("a is greater than 0" + "\n");

        int b = -5;
        if (b >= 0) System.out.println("b is greater or equal to 0");
        else System.out.println("b is less than 0" + "\n");

        int c = 20;
        int d = 100;
        int e;

        if (c > d) {
            e = c - d;
            System.out.println("c > d than e equal to: " + e);
        } else {
            e = d - c;
            System.out.println("d > c than e equal to: " + e + "\n");
        }

        for (int i = 0; i < 5; i++) {
            if (i == 1)
                System.out.println("i is one");
            else if (i == 2)
                System.out.println("i is two");
            else if (i == 3)
                System.out.println("i is three");
            else                                                //default case
                System.out.println("i is not between 1 and 3");
        }

    }
}
