/*
 *
 * Example of extends Interfaces
 *
 */

package interfaces;

public class InterfaceExtendsDemo implements InterfaceB {

    public static void main(String[] args) {

        InterfaceExtendsDemo obj1 = new InterfaceExtendsDemo();
        obj1.method1();
        obj1.method2();
        obj1.method3();
    }

    public void method1() {
        System.out.println("This is method number one");
    }

    public void method2() {
        System.out.println("This is method number two");
    }

    public void method3() {
        System.out.println("This is method number three");
    }
}
