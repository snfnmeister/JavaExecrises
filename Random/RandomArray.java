/*
 *
 * Java using java.util.Random class.An instance of this class is used to generate a stream of
 * pseudorandom numbers.The class uses a 48-bit seed, which is modified using a linear congruential formula.
 * syntax: Random.next
 *               .nextBoolean
 *               .nextBytes
 *               .nextDouble
 *               .nextFloat
 *               .nextGaussian
 *               .nextInt
 *               .nextLong
 *
 */

import java.util.Random;

public class RandomArray {

    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rnd = new Random(System.currentTimeMillis()); //create Random Generator using seed

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(10); //bound - maximum value of generated numbers i.e: (0 to 10-1)
            System.out.print(arr[i] + " ");
        }

    }
}
