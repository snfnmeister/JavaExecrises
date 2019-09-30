/*
 *
 * Java ReverseBytes methods
 * Raw Java data presents in Big-Endian order (Network order)
 *
 */

public class ByteOrders {

    public static void main(String[] args) {

//      reverseBytes method (Short/Integer/Long.reverseBytes(value)
        int A = 0x11223344;
        System.out.println("Reversed int A (0x11223344) = 0x" + String.format("%x", Integer.reverseBytes(A)));

//      using bitmask
        int B = 0x55667788;
        int reversed = B << 24 | B >> 8 & 0xff00 | B << 8 & 0xff0000 | B >>> 24;
        System.out.println("Reversed int B (0x55667788) = 0x" + String.format("%x", reversed));

    }
}
