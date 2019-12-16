/*
 *
 * Demonstration of using Recursive method for factorial calculating
 *
 */

public class Factorial {

    public long getFactr(int n) {        //recursive method
        long result;
        System.out.print("-" + n);
        if (n == 1) return 1;            //when n == 1 recursion will stop

        result = getFactr(n - 1) * n; //recursive method
        return result;

    }
}
