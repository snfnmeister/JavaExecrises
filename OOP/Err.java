/*
 *
 * Examples how to return object data type from method;
 *
 */

//object that will returned from some method
public class Err {
    int code;           //error code
    String description; //error description

    Err(int code, String description) {
        this.code = code;
        this.description = description;
    }

}
