/*
 *
 * Convert number to bits present
 * Example of using Java local class
 *
 */

public class ShowBits {

    public static void main(String[] args) {

//  local class LocalShowBits
        class LocalShowBits {
            int numbits;

            LocalShowBits(int n) {
                numbits = n;
            }

            void show(long val) {
                long mask = 1;

//           shift to left
                mask <<= numbits - 1;

                int spacer = 0;
                for (; mask != 0; mask >>>= 1) {
                    if ((val & mask) != 0) System.out.print("1");
                    else System.out.print("0");
                    spacer++;
                    if ((spacer % numbits) == 0) {
                        System.out.print(" ");
                        spacer = 0;
                    }
                }
                System.out.println();
            }
        }

        for (int b = 0; b <= 999; b++) {
            LocalShowBits byteval = new LocalShowBits(32);
            System.out.print(b + " in bits: ");
            byteval.show(b);
        }
    }
}