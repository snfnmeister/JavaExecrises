/*
 *
 * Using while loop in Java
 * Syntax: while (expression) {
 *              statement(s)
 *         }
 *
 *         --
 *         Use if needed 'break' operator
 *         for immediately stop the loop
 *
 */


public class WhileLoop {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            System.out.print(i + "/");
            i++;
        }
        System.out.println();

        int j = 0;
        while (true) {
            System.out.print(j + ".");
            if (j == 13) {
                System.out.println(" - The 13th spotted!");
                break;
            }
            j++;

        }


    }
}

