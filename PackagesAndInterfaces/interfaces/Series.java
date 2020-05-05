/*
 *
 * Example of using Interfaces
 * + added default method
 *
 */
package interfaces;

public interface Series {

    int getNext(); //return get next number

    void reset(); //resetting

    void setStart(int x); //set default data

    default int[] getNextArray (int n) { //return array with n elements which lie to next element

        int[] vals = new int[n];

        for(int i = 0; i < n; i++)
            vals[i] = getNext();
            return vals;


    }
}

