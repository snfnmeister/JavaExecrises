/*
 *
 * Java String equalsIgnoreCase() method. Method returns true if argument do not equal to null and strings equal
 * to each other without case sensitivity, otherwise - false
 * syntax: boolean equalsIgnoreCase(String anotherString)
 * !w/o case sensitivity!
 *
 */
public class StringEqualsIgnoreCase {

    public static void main(String[] args) {

        String strOne = "Hello World!";
        String strTwo = null;
        String strThree = "hELLo wORLd?";

        System.out.println("strOne equal to strTwo? - " + strOne.equalsIgnoreCase(strTwo));
        System.out.println("strOne equal to strThree? - " + strOne.equalsIgnoreCase(strThree));
    }
}
