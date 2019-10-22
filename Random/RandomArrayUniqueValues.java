/*
 *
 * Fill array with unique numbers. Numbers not allow to repeat
 *
 */

import java.util.Random;

public class RandomArrayUniqueValues {

    public static void main(String[] args) {

        int[] arr = new int[10];
        boolean flag = false;
        Random random = new Random(System.currentTimeMillis());

        for (int i = 0; i < arr.length; i++) { //don't forget about Array exceptions when works with [i-1] stations!
            do {
                arr[i] = random.nextInt(10);    //generate random number
                for (int j = 0; j < i; j++) {  //check for repeating
                    if (arr[i] == arr[j]) {
                        flag = true;           //if repeated element found then break and try to generate new value
                        break;                 //repeated element found, not needed to continue compare a[i] == a[j]
                    } else {
                        flag = false;
                    }
                }
            } while (flag);                   //continues while element repeat
            System.out.print(arr[i] + " ");

        }
    }
}
