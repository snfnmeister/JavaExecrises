/*
 * Java shortcut logic operators
 *
 * && - AND (shortcut)
 * || - OR (shortcut)
 * ! - NOT
 */

public class LogicOperators {

    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;

        System.out.println("a AND b = " + (a && b));
        System.out.println("a OR b = " + (a || b));
        System.out.println("NOT(a AND b) = " + !(a && b));
    }
}
