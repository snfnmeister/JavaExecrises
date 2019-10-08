/*
 *
 * Java string.length() method: return the length of the string.
 * The length is equal to the number of Unicode code units in the string.
 * syntax: public int length()
 *
 */

public class StringLength {

    public static void main(String[] args) {

        String str1 = "Hello  World!";
        int length = str1.length(); //method length()
        System.out.println("Length of string - " + length);

    }
}