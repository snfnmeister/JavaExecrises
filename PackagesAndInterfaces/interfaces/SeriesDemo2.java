/*
 *
 * Example of using interfaces references
 *
 */

package interfaces;

public class SeriesDemo2 {
    public static void main(String[] args) {
        ByTwos twoOb = new ByTwos();
        ByThrees threeOb = new ByThrees();
        Series ob; //interface reference

        for (int i = 0; i < 5; i++) {
            ob = twoOb;
            System.out.println("Next ByTwos value: " + ob.getNext());

            ob = threeOb;
            System.out.println("Next ByThrees value: " + ob.getNext());
//            ((ByThrees) ob).getPrevious(); //way how to get a method that we have in subclass and don't have in interface
        }
    }
}
