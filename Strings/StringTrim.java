/*
 *
 * Java String.trim() method. Returns copy of String without spaces in start and end of string.
 * syntax: public String trim();
 *
 */
public class StringTrim {

    public static void main(String[] args) {

        String str1 = "    _Tomsk the capital of great Britain!_     ";  //remove all spaces
        String str2 = str1.trim();
        String str3 = "  ab   ";                                         //remove all spaces
        String str4 = str3.trim();
        System.out.println(str2 + "-length is " + str2.length());
        System.out.println(str4 + "-length is " + str4.length());

    }
}
