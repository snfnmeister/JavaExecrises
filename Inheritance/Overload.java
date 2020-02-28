/*
*
* Example of using method overloading in superclass and subclass
* Overriding methods - using in Inheritance when superclass and subclass have methods with same name and signatures
* Overloading methods - methods with same name but different signatures
*
*/

public class Overload {
    public static void main(String[] args) {
        classD dOb = new classD(1,2,3);
        dOb.show("This is k value: ");
        dOb.show();
    }
}
