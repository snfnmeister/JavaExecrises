/*
*
* Example of using default methods in Interfaces
*
*/

package interfaces;

public interface MyIF {

    int getUserID();

    default int getAdminID() { //default method
        return 1;
    }
}
