/*
 *
 * Implementation of Caesar Cipher in Java
 *
 */

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        int k = 3; //shift num for Cipher

        Scanner in = new Scanner(System.in);

        System.out.print("Enter you String: ");
        String inData = in.nextLine();

        char[] charArray = inData.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                charArray[i] = (char) (charArray[i] + k);
            }

        }
        String outData = new String(charArray);
        System.out.println("You words was encoded by Caesar Cipher is: " + outData);
        System.out.print("You decoded words: ");

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                charArray[i] = (char) (charArray[i] - k);
            }
            System.out.print(charArray[i]);

        }


    }
}