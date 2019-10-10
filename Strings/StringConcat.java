/*
 * Java String concat() method: concatenates the specified string to the end of this string.
 * If the length of the argument is 0, then this String object is returned.
 * Otherwise, a new String object is created, representing a character sequence that is the
 * concatenation of the character sequence represented by this String object and the character
 * sequence represented by the argument string.
 * ! BEWARE OF NULL !
 */
public class StringConcat {

    public static void main(String[] args) {

        boolean b = false;
        String str1 = "Hello";
        String str2 = "World!";
        String str3 = "Kitty!";

        System.out.println(str1.concat(" ").concat(b ? str2 : str3));
        System.out.println("Hello".concat(" ").concat("World!"));

//      diff ways to concat
        String str4 = null; // argument is null - it will lead to NullPointerException (NPE)
        str4 = str4.concat(" Rules");
        str4 = str4.concat(" The Web!");
        System.out.println(str4);

//      diff ways to concat
        String str5 = "";
        str5 = str5.concat(" is").concat(" just a").concat(" String concatenation.");
        System.out.println(str5);

    }
}
