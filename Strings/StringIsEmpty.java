/*
 *
 * Java String.isEmpty() method. Returns true if string.length() equals to 0
 * syntax: public boolean isEmpty()
 *
 */
public class StringIsEmpty {

    public static void main(String[] args) {

        String str1 = new String("El Stringinio");
        String str2 = "";
        System.out.println("String not EMPTY - " + str1.isEmpty() +
                "\nString is EMPTY - " + str2.isEmpty());
    }
}
