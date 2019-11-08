/*
 *
 * Character - it is wrapper for Java primitive type - char
 * This method determines if the specified character is an uppercase character
 * syntax: public static boolean isUpperCase(char ch)
 *
 */

public class CharacterIsUpperCase {

    public static void main(String[] args) {

        String str1 = "AaaaAAaaaaaA";
        //how much UpperCase characters in the String?
        char[] chars = str1.toCharArray();

        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
            if (Character.isUpperCase(chars[i])) counter++; //if true - counter will increment;
        }
        System.out.println("UpperCase symbols in String: " + str1 + " - " + counter);

    }

}
