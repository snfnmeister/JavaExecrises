/*
 *
 * This method search substring in String and returns last entry index, if don't found - returns -1
 * syntax: int lastIndexOf(String str)
 *
 */
public class StringLastIndexOf {

    public static void main(String[] args) {

        String str1 = "\"One two three four five\"";
        String str2 = "\"five two three four\"";
        System.out.println("str1: " + str1 + "\n" + "str2: " + str2);

        System.out.println("Substring \"five\" in str1 found? - " + (str1.lastIndexOf("five") >= 0 ? "true" : "false"));
        System.out.println("Substring \"five\" in str2 found? - " + (str2.lastIndexOf("five") >= 0 ? "true" : "false"));
    }
}
