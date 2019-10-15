/*
 *
 * Java Arrays.sort() method: this method use for sort array of integers to ascending order
 * syntax: public static void sort(int[] arr, int from_Index, int to_Index)
 * This method doesn't return any value.
 *
 */

import java.util.Arrays;

public class UtilArraysSort {

    public static void main(String[] args) {

        int[] arr = {1, 5, 4, -10, 2, -5, 7, 8, -3};

        Arrays.sort(arr, 0, 4);

        for (int i : arr) {
            System.out.print(i + " ");
        }


    }
}
