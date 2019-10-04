/*
 *
 * Java for-each operator
 * syntax:
 *        for (value:array/collection) {
 *        do something
 *        }
 *        value and array/collection (that included in java.lang.Iterable) must be one type data or compatible
 *
 */
public class ForEachOperator {

    public static void main(String[] args) {
//        set array elements to square
        int[] mathArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i : mathArray) {
            System.out.println(i * i);
            if (i == 5) break;
        }
//       count summ of array elements
        int sum = 0;
        for (int j : mathArray) {
            sum += j;
        }
        System.out.println("Summ of array - mathArray is " + sum);
    }
}
