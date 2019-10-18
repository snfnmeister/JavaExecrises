/*
 *
 * Java substring() method. Returns new string which is substring of the string.
 * syntax, 2 ways:
 *  - public String substring(int beginIndex);
 *  - public String substring(int beginIndex, int endIndex);
 *
 */
public class StringSubstring {

    public static void main(String[] args) {

        String str = "Hello World!";
        String world = str.substring(6);
        String hello = str.substring(0, 5);

        System.out.println(world);
        System.out.println(hello);
        System.out.println("Sons of Anarchy".substring(8));

    }
}
