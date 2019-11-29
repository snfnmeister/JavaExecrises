/*
 *
 * Examples how to return object data type from method;
 *
 */

public class ErrInfo {

    public static void main(String[] args) {

        ErrorInfo err = new ErrorInfo(); // initialize ErrorInfo class object - err
        Err e;                           // initialize reference to Err class object

        int[] errCodes = {1, 2, 10};       // array of dif error codes

        for (int i : errCodes) {
            e = err.getErrorInfo(i);     // we returned object of Err class with needed for us fields
            System.out.println("Error code: " + e.code + " Description: " + e.description);
        }

    }
}
