/*
 *
 * Java String.compareTo() method. This method returns negative value if current string less than "str".
 * Returns zero if this string equals and positive value if current string large than "str".
 * !This method is case sensitivity!
 * syntax: int compareTo(String str)
 *
 */
public class StringCompareTo {

    public static void main(String[] args) {

        String str1 = "Hello World!";
        String str2 = "Hello dat World!";
        String str3 = "Hello World!";
        String str4 = "Hello";

        System.out.println("Strings less: " + str1.compareTo(str2));
        System.out.println("Strings equals: " + str1.compareTo(str3));
        System.out.println("Strings large: " + str1.compareTo(str4));

    }
}
