/*
 *
 * Make a way how to Reverse array in Java. Way with creating new array
 *
 */

import java.util.Arrays;

public class ArraysReverse {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int arrSize = arr.length;
        int[] reverseArr = new int[arrSize];

        for (int i = 0; i < arrSize; i++) {
            reverseArr[i] = arr[arrSize - 1 - i];
        }

        System.out.println(Arrays.toString(reverseArr)); //method Arrays.toString() requires java.util.Arrays

    }
}
