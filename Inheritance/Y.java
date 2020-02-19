/*
 *
 * Example of using references to superclass/subclass objects in Inheritance
 *
 */

public class Y extends X {
    int i;

    Y(int i, int j) {
        super(j);
        this.i = i;
    }
}