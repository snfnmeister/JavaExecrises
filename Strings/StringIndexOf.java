/*
 *
 * Find substring in string, if found - returns first entry index, if don't found returns -1
 * syntax: int indexOf(String str)
 *
 */

import java.util.Scanner;

public class StringIndexOf {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string!");
        String str = sc.nextLine();

        if (str.indexOf("fuck") >= 0 | str.indexOf("microbe") >= 0 | str.indexOf("damn!") >= 0) {
            System.out.println("You are using bad words!");
        } else {
            System.out.println("You string - " + str);
        }

    }
}
