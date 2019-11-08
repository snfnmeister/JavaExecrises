/*
 *
 * Write a function to convert a name into initials. Takes two words (maybe more) with one space (maybe more)
 * in between them and convert to Abbreviations. If input string have 2 words - return string in "A.B" format.
 * If string contains more than 2 words return usual abbreviations
 *
 */

import java.util.Scanner;
public class StringsAbbreviations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String str1 = sc.nextLine();

        char[] charArray = str1.toCharArray();
        String str2 = "";

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isUpperCase(charArray[i])) {
                str2 = str2 + charArray[i]; //bad solutions because of immutable strings

            }
        }
        System.out.println(str2);


    }
}
