/*
 *
 * gc working demonstration
 *
 */

public class Finalize {

    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);

//        generating much object and wait for garbage collector for delete them

        for (count = 1; count < 1000000; count++) //
            ob.generator(count);
    }
}
