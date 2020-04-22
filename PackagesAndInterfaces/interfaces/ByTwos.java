/*
 *
 * Example of using interfaces
 *
 */

package interfaces;

public class ByTwos implements Series {
    int start;
    int val;

    ByTwos() {
        start = 0;
        val = 0;
    }

//      interface methods implementations
    public int getNext() {
        val += 1;
        return val;
    }

    public void reset() {
        start = 0;
        val = 0;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }


}
