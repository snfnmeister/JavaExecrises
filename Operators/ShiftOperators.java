/*
 *
 * Java operations with bits
 *
 */

public class ShiftOperators {
    public static void main(String[] args) {

        byte a = -85;

        System.out.println(Integer.toBinaryString(a) + " that equal to = " + a + "\n");
        System.out.println("Shift by right divide number by 2");
        System.out.println("Shift to right by 1 'a >> 1': - " + Integer.toBinaryString(a >>> 1) +
                " that equal to = " + (byte) (a >> 1));
        System.out.println("Shift to right by 2 'a >> 2': - " + Integer.toBinaryString(a >> 2) +
                " that equal to = " + (byte) (a >> 2));
        System.out.println("Shift to right by 3 'a >> 3': - " + Integer.toBinaryString(a >> 3) +
                " that equal to = " + (byte) (a >> 3) + "\n");

        System.out.println("Shift by left multiply number by 2");
        System.out.println("Shift to left by 1 'a << 1': - " + Integer.toBinaryString(a << 1) +
                " that equal to = " + (a << 1));
        System.out.println("Shift to left by 2 'a << 2': - " + Integer.toBinaryString(a << 2) +
                " that equal to = " + (a << 2));
        System.out.println("Shift to left by 3 'a << 3': - " + Integer.toBinaryString(a << 3) +
                " that equal to = " + (a << 3) + "\n"); // byte and short will be autocast to int
        // need to user (byte), (short) to get what u want

        System.out.println("Shift by right with adding zeros in high bits 'a >>> 3' - "
                + Integer.toBinaryString(a >>> 32) + " that equal to = " + (byte) (a >>> 32));


    }


}
