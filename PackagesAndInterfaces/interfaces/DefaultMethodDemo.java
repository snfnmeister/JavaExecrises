/*
*
* Example of using default interface methods
* +added example of using static interface methods
*
*/

package interfaces;

public class DefaultMethodDemo {

    public static void main(String[] args) {

        MyIFImp obj1 = new MyIFImp();

        System.out.println("User ID: " + obj1.getUserID());
        System.out.println("Admin ID: " + obj1.getAdminID());
        System.out.println("Static interface method returns: " + MyIF.getUniversalID());
    }
}
