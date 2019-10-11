/*
 *
 * Java array Bubble Sort - easiest algorithm for realization, algorithm difficult - O(n^2). Not for large arrays
 *
 */
public class ArrayBubbleSort {

    public static void main(String[] args) {

        int[] arr = {3, -2, 0, -3, -1, 2, 1, 4, -6, 7, -8, 10, 12, -13}; //unsorted array
        boolean isSorted = false;
        int temp;
        int z = 0; //external while loop counter;
        int k = 0;
        while (!isSorted) {
            isSorted = true; //if flag isSorted in underlying for loop not been changed it means that array is
            // sorted now and loop can be stopped
            z++;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) { //if arr[i] greater than arr[i+1]
                    temp = arr[i];         //temp equal to arr[i]
                    arr[i] = arr[i + 1];   //arr[i] equal to arr[i+1]
                    arr[i + 1] = temp;     //arr[i+1] values becomes arr[i] value
                    isSorted = false;      //algorithm continues working
                }
            }

        }

        System.out.println("External while loop counter : " + z);

        for (int j : arr) { //output sorted array to log
            System.out.print(j + " ");
        }

    }

}
