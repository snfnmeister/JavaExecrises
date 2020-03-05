/*
 *
 * Examples of using dynamic methods dispatch
 *
 */

public class DynDispDemo {
    public static void main(String[] args) {
        Sup superClassOb = new Sup(); //object of superclass Sup
        Sub1 subClassOb1 = new Sub1(); //object of subclass Sub1
        Sub2 subClassOb2 = new Sub2(); //object of subclass Sub2

        Sup superClassRef; //void reference to superclass

        superClassRef = superClassOb; //superclass reference pointed to subclass object
        superClassRef.who();          //use method that described in superclass

        superClassRef = subClassOb1;
        superClassRef.who();          //use method that described in subclass1

        superClassRef = subClassOb2;
        superClassRef.who();          //use method that described in subclass2

    }
}
