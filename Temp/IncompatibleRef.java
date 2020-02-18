/*
 *
 * Diff examples of using references
 *
 */

public class IncompatibleRef {
    public static void main(String[] args) {
        classX x = new classX(10);
        classX x2;
        classY y = new classY(15);
        x2 = x;
//        x2 = y; //dont work because of variables diff types(classes)

        System.out.println(x + "\n" + x2);
    }
}
