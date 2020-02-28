/*
 *
 * Example of using priority of constructors in Inheritance and methods override
 * classC <- classB <- classA
 *
 */

public class classB extends classA {
    int k;

    classB() {
        System.out.println("This is constructor of class B");
    }

    classB(int a, int b, int k) {
        super(a, b);
        this.k = k;

    }

    //show k variable
    void show() { //same name and params as parent method show
        super.show();
        System.out.println("ClassB: k - " + k);

    }

}
