/*
 *
 * Java String initializations
 *
 * The String class represents character strings. Interface: CharSequence.
 * Strings are constant; their value cannot be changed after they are created (they are immutable)
 * For change string Java have classes like: StringBuffer and StringBuilder.
 * Physically strings it's reference to memory where chars are stored
 * String class have 11 constructors
 *
 */

public class StringInit {

    public static void main(String[] args) {
        char[] chars = new char[]{'H', 'e', 'l', 'l', 'o'}; //chars array

//      how to init string
        String str1 = "Hello";
        String str2 = new String();                          //empty string
        String str3 = "";                                    //empty string
        String str4 = new String(chars);                     //init by chars array
        String str5 = new String(chars, 0, 2);  //init by diapason of char array;
//                                                            1st number is index and 2nd is length
        String str6 = new String("Hello");
        String str7 = new String(str6);
        str6 = "bye";

        System.out.println("str1 - " + str1);
        System.out.println("str2 - " + str2);
        System.out.println("str3 - " + str3);
        System.out.println("str4 - " + str4);
        System.out.println("str5 - " + str5);
        System.out.println("str6 - " + str6);
        System.out.println("str7 - " + str7);


    }
}
