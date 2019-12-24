/*
 *
 * Find a way how to clear console log by Java methods
 *
 */

public class EmptyConsole {

    public static void main(String[] args) {

        String str1 = "Hello world";
        System.out.print(str1);
//        System.out.println("World!");


        for (int i = 0; i < str1.length(); i++) {
            System.out.print("\b");
        }


    }
}
