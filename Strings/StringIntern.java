/*
 *
 * Java using "equals", "==" to compare strings and differences between this methods
 *
 */

public class StringIntern {

    public static void main(String[] args) {

        String str1 = "Hello World";
        String str2 = new String("Hello World");
        String str3 = str2;

        System.out.println("str1 == str2? - " + (str1 == str2)); //variables point to same object?
        System.out.println("str1 equals to str2? - " + str1.equals(str2)); //variable have equals values?
        System.out.println((str3 == str2) + "/" + (str2.equals(str3)));


    }
}
