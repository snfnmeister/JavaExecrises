/*
 *
 * Example of using Non-static nested (inner) class
 *
 */

import java.util.Scanner;

public class NestedClassDemo {
    public static void main(String[] args) {

//      get String data by user
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your string: ");
        String str = in.nextLine();

//      using Outer class with Analyze() method (which using Inner class with some methods for working with strings)
        Outer outer = new Outer(str);
        outer.Analyze();
    }
}
