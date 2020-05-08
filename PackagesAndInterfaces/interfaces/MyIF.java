/*
*
* Example of using default methods in Interfaces
* +added static interface method
*/

package interfaces;

public interface MyIF {

    int getUserID();

    default int getAdminID() { //default method
        return 1;
    }

    static int getUniversalID() { //static interface method
        return 1337;
    }
}
