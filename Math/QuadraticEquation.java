
/*
 *
 * way how to solve quadratic equation in Java
 * quadratic equation:
 *    syntax:
 *    a*(x^2)+b*x+c = 0 // (^2) - this is not XOR expression, it will squared x variable
 */

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        double a, b, c; //variables
        double D; //discriminant

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a, b and c variables: " + "\n" + "a = ");

        a = in.nextDouble();
        if (a == 0) {
            System.out.println("a variable must be not equal to 0");
            System.exit(0);
        }

        System.out.print("b = ");
        b = in.nextDouble();
        if (b == 0) {
            System.out.println("b variable must be not equal to 0");
            System.exit(0);
        }

        System.out.print("c = ");
        c = in.nextDouble();
        System.out.println("You equation is: " + a + ("\u2219x\u00b2 + ") + b + ("\u2219x + ") + c + " = 0");

        System.out.println("D = " + (D = (b * b - 4 * a * c)));

        if (D > 0) {
            System.out.println("x\u2081 = " + ((-b - Math.sqrt(D)) / (2 * a)));
            System.out.println("x\u2082 = " + ((-b + Math.sqrt(D)) / (2 * a)));
        } else if (D == 0) {
            System.out.println("x = " + (-b / 2 * a));
        } else if (D < 0) {
            System.out.println("D is less than 0, x values cannot be calculated");
        }


    }


}
