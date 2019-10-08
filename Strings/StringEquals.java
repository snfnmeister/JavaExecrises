/*
 *
 * Java String equals() method: compares this string to the specified object. The result is true if and only if the
 * argument is not null and is a String object that represents the same sequence of characters as this object.
 *
 */
public class StringEquals {                   //class

    public static void main(String[] args) {  //method


        int a = 5;
        String str1 = "aa bb cc dd";
        String str2 = null;
        String str3 = "AA bb CC dd";
        boolean equals1 = str1.equals(str3); //must be strings!
        boolean equals2 = str3.equals(str2); //must be strings!

        System.out.println("Strings equals? - " + equals1);
        System.out.println("Null equals - " + equals2); // if argument is null it will lead to
        // NPE (null pointer exception)


    }
}