/*
 *
 * Java Infinite Loops
 * syntax: while (true)
 *
 *         for (;true; )
 *
 *         for (; ; )
 *
 *         do {
 *             something;
 *         } while (true)
 *
 */
public class InfiniteLoops {

    public static void main(String[] args) {
//        infinite For loop
        int i = 0;
        for (; ; ) {
            if (i == 1000) break;
            i++;
        }
        System.out.println("For loop Stopped!");
//        infinite While loop
        int j = 0;
        while (true) {
            if (j == 1000) break;
            j++;
        }
        System.out.println("While loop Stopped!");

//        infinite Do-While Loop

        int k = 0;
        do {
            if (k == 1000) break;
            k++;
        } while (true);
        System.out.println("Do-While loop Stopped!");

    }
}
