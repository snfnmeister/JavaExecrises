/*
 *
 * Java For Loop without parameters
 * syntax: In java you can don't tell parameters in For loop
 *         for ( ; ; ) - infinite loop
 *         for ( ;"condition"; ) - will be able to work
 *
 */

public class ForLoopParameters {

    public static void main(String[] args) {

//        int i = 0;
//        infinite loop
//        for (; ; ) {
//            i++;
//            System.out.println(i);
//        }

        int j = 0;
        for (; j < 100; ) {
            j++;
        }
        System.out.println("1)" + j);

        for (int a = 0; ; ) {
            if (a == 10) break;
            a++;
            System.out.println("2)" + a); //scope of variables
        }

        int d = 0;
        for (; d <= 5; d++) {
            System.out.println("3)" + d);
        }


    }
}
