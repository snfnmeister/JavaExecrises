/*
 *
 * Initialization one object thru another one
 * Using override for constructors for Summation class
 *
 */

public class Summation {
    int sum;

    // made object with int num in constructor params
    Summation(int num) {
        sum = 0;
        for (int i = 1; i <= num; i++)
            sum += i;
    }

    //  made object which based on another object
    Summation(Summation ob) {
        sum = ob.sum;
    }
}
