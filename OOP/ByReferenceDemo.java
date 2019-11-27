/*
 *
 * Demonstration of working  object data type in methods parameters
 *
 */

public class ByReferenceDemo {

    public static void main(String[] args) {

        ByReference object1 = new ByReference(5, 10);

//        data before call change() method
        System.out.println("Object data before call change() method: \n" + "a = " + object1.a + "\nb = " + object1.b);

//        call change method()
        object1.change(object1);

//        data after call change() method
        System.out.println("Object data after call change() method: \n" + "a = " + object1.a + "\nb = " + object1.b);

    }
}
