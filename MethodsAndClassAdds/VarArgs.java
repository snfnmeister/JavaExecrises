/*
 *
 * Example of using methods with variable numbers of args
 *
 */

class VarArgs {

    static int[] a = {1, 2, 3, 4, 5};

    private static void vaTest(int... v) {
        System.out.println("Numbers of args: " + v.length);
        System.out.println("Contents of: ");

        for (int i = 0; i < v.length; i++)
            System.out.print(" arg " + i + ": " + v[i] + "\n");


    }

    public static void main(String[] args) {

        vaTest();
        vaTest(1);
        vaTest(1, 2, 3);
        vaTest(a);
    }
}
