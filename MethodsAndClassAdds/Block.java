/*
 *
 * Demonstration of passing objects to methods parameters
 *
 */

public class Block {

    private int a, b, c;
    private int volume;

    Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }

    //    sizes are equals?
    boolean sameBlock(Block object) {
        return (object.a == a) & (object.b == b) & (object.c == c);
    }

    //    volumes are equals?
    boolean sameVolume(Block object) {
        return object.volume == volume;
    }


}
