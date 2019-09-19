/*
 *
 * Using while loop in Java
 * Syntax: while (condition) {
 *              // do somethng
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
        while (j >= 0) {
            System.out.print(j + ".");
            if (j == 13) {
                System.out.println(" - The 13th spotted!");
                break;
            }
            j++;

        }


    }
}

