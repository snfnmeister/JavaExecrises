/*
 *
 * Java String charAt() method
 * syntax: char charAt(index);
 *
 */
public class StringCharAt {

    public static void main(String[] args) {

        String str = "Strings in Java are immutable";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                System.out.print("_");
            } else {
                System.out.print(str.charAt(i)); //log String by symbols
            }
        }
        System.out.print("!");

    }

}
