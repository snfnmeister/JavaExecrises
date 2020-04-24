/*
 *
 * Example of using interface with consts only
 *
 */

package interfaces;

public class IConstDemo implements IConst {
    public static void main(String[] args) {
        int nums[] = new int[MAX];

        for (int i = MIN; i < 11; i++) {
            if (i >= MAX) System.out.println(ERRORMSG);
            else {
                nums[i] = i;
                System.out.println(nums[i]);
            }
        }
    }
}
