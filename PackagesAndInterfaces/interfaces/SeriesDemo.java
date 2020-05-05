/*
 *
 * Example of using interfaces
 *
 */

package interfaces;

public class SeriesDemo {
    public static void main(String[] args) {
        ByTwos obTwo = new ByTwos();

        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + obTwo.getNext());

        System.out.println("\nResetting...");
        obTwo.reset();
        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + obTwo.getNext());

        System.out.println("\nStart val: 10");
        obTwo.setStart(10);
        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + obTwo.getNext() + ", prev values = " + obTwo.getPrevious());

        System.out.println("\nBy Three:");
        ByThrees obThree = new ByThrees();

        for (int i = 0; i < 5; i++)
            System.out.println("Next value: " + obThree.getNext());


        for(int j: obThree.getNextArray(10)) {
            System.out.println("Lie to next value: " + j);
        }


    }


}
