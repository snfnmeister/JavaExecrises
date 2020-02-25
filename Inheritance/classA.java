/*
 *
 * Example of using priority of constructors in Inheritance and method override
 * classC <- classB <- classA
 *
 */

public class classA {
    int i, j;

    classA() { //default constructor
        System.out.println("This is constructor of class A");
    }

    classA(int i, int j) {
        this.i = i;
        this.j = j;
    }

    //show i and j variables
    void show() {
        System.out.println("ClassA: i and j - " + i + "," + j);
    }
}
