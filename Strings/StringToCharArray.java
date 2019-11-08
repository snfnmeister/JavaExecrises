/*
 *
 * This method converts String to a new character array
 * syntax: public char[] toCharArray()
 *
 */

public class StringToCharArray {

    public static void main(String[] args) {

        String str1 = "Today is some rainy";   //String
        char[] charArray = str1.toCharArray(); //String to char[]

        for (char i : charArray)
            System.out.print(i);               //Array presented

    }
}