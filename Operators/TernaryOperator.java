/*
 *
 * '?' - Ternary (conditional) operator in Java
 * Ternary operator replaces structure (if-else): if (true) - > then VARIABLE equals VAlUE_1
 *                                                    else  - > then VARIABLE equals VALUE_2
 *
 * looks like: VARIABLE_1  = (conditional) ? conditional_true - VALUE_1 : conditional_false - VALUE_2;
 *
 */
public class TernaryOperator {

    public static void main(String[] args) {
        int a, b;
        a = 10;

        b = (a == 10) ? 10 : 0;
        System.out.println(b);

        b = (a <= 10) ? 5 : 0;
        System.out.println(b + "\n");

        int c = 100;
        boolean d;

        d = c >= 100;
        System.out.println(d);

        d = c < 50;
        System.out.println(d + "\n");

        int q = 10;
        int w = 10;
        String E;

        E = ((q > w)) ? "q greater then w " : "w greater then q";
        System.out.println(E);

        E = (q == w) ? "q equals to w" : "q and w not equal";
        System.out.println(E);

        //make internal ternary operator


    }

}
