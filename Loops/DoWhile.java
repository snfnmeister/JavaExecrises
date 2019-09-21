/*
 *
 * Java Do-While loop:
 * syntax: do {
 *             statement(s)
 *         } while (expression);
 *
 * Main difference between While and Do-While loops: statements in do-while block are always executed
 * at least once (even if expression in while () equal to false);
 * Continues executed only if expression in while() equal to true;
 *
 */

public class DoWhile {

    public static void main(String[] args) {

        int i = 0;
        do {
            System.out.print(i + ".");
            System.out.println(i ^ 2); // what do (i^N) in java?
            i++;
        } while (i <= 10);

    }
}
