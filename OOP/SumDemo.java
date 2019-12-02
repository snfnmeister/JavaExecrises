/*
 *
 * Using Summation class with 2 dif types of constructor (int num in one and Summation object in another)
 *
 */


public class SumDemo {

    public static void main(String[] args) {
        Summation s1 = new Summation(10);
        Summation s2 = new Summation(s1); //using sum field of s1 object to initialize s2 object

        System.out.println("s1.sum field: " + s1.sum);
        System.out.println("s2.sum field: " + s2.sum);


    }
}
