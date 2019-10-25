/*
 *
 * Make a way to how reverse string in java!
 *
 */

import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string");
        String str1 = sc.nextLine();
        int strLength = str1.length();
        char[] arr = new char[strLength];
        int j = 0;
        for (int i = strLength - 1; i <= 0; i--, j++) {
            //arr[j] = str1.charAt(i);
            System.out.print(str1.charAt(i));
        }
        System.out.println(arr[2]);
        System.out.println("Your reversed string\n" + Arrays.toString(arr));

    }
}
