/*
 *
 * Example of using interfaces
 *
 */

package interfaces;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos ob = new ByTwos();

        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + ob.getNext());

        System.out.println("\nReset");
        ob.reset();
        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + ob.getNext());

        System.out.println("\nStart val: 10");
        ob.setStart(10);
        for(int i=0; i < 5; i++)
            System.out.println("Next value: " + ob.getNext());


    }


}
