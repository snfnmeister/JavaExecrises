/*
 *
 *Example of using overload in Inheritance
 *
 */

public class classD extends classA {
    int k;

    classD(int a, int b, int k) {
        super(a, b);
        this.k = k;

    }

    //overload method show()
    void show(String msg) { //different signatures between this method and method from superclass
        System.out.println(msg+k);

    }


}
