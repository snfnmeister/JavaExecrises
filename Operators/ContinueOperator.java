/*
 *
 * Java "continue" operator - using when needed to skip block of code  in loop that lie down to keyword "continue"
 *
 */


public class ContinueOperator {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) continue;
            System.out.print(i + "/");

        }
    }
}
