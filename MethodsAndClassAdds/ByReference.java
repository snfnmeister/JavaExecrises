/*
 *
 * Parameters in methods can be: simple data or object data (thru reference)
 *
 */

public class ByReference {

    int a;
    int b;

    ByReference(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void change(ByReference object) {
        object.a = object.a + object.b;
        object.b = -object.b;
    }
}
