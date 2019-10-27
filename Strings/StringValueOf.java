/*
 * String.valueOf
 * Convert instance of any class/primitive type to string
 *
 */
public class StringValueOf {

    public static void main(String[] args) {
        int a = 5;

        String intStr = String.valueOf(a);
        String charStr = String.valueOf('A');
        String longStr = String.valueOf(14881L);
        String floatStr = String.valueOf(12345F);
        String doubleStr = String.valueOf(1.24D);
        String boolStr = String.valueOf(true);

        System.out.print(intStr + '\n' +
                charStr + '\n' +
                longStr + '\n' +
                floatStr + '\n' +
                doubleStr + '\n' +
                boolStr + '\n'
        );
    }
}
