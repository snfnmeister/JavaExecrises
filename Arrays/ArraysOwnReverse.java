/*
 *
 * Make a way how to Reverse array without creating new array
 *
 */

import java.util.Arrays;

public class ArraysOwnReverse {

    public static void main(String[] args) {

        int temp = 0;
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0}; //works fine with even and odd array size

        for (int i = 0; i < (arr.length / 2); i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
