
/*
 * Convert integer (byte, short, int, long, char) to bits present by Integer.toBinaryString with lead zeros
 * + shown in inverted bits
 *
 */

public class toBits {
    static byte a = 127;
    static short b = 30000;
    static int c = 33333;
    static long d = 25111111L;
    static char E = 'A';

    public static void main(String[] args) {

        String byteA = String.format("%8s", Integer.toBinaryString(a)).replace(' ', '0'); // add lead zeros
        String shortB = String.format("%16s", Integer.toBinaryString(b)).replace(' ', '0');
        String intC = String.format("%32s", Integer.toBinaryString(c)).replace(' ', '0');
        String longD = String.format("%64s", Long.toBinaryString(d)).replace(' ', '0');
        String charE = String.format("%16s", Integer.toBinaryString(E)).replace(' ', '0');

        System.out.println("Приведение числа а к битовому порядку (" + byteA.length() + " бит): " + byteA);
        System.out.println("Приведение числа b к битовому порядку (" + shortB.length() + " бит): " + shortB);
        System.out.println("Приведение числа c к битовому порядку (" + intC.length() + " бита): " + intC);
        System.out.println("Приведение числа d к битовому порядку (" + longD.length() + " бита): " + longD);
        System.out.println("Приведение числа E к битовому порядку (" + charE.length() + " бит): " + charE + "\n");

        System.out.println("Приведение числа ~а к битовому порядку " + Integer.toBinaryString((short) ~a));// operator tilda "~" replaces lead zeros with 1
        System.out.println("Приведение числа ~b к битовому порядку " + Integer.toBinaryString(~b));
        System.out.println("Приведение числа ~c к битовому порядку " + Integer.toBinaryString(~c));
        System.out.println("Приведение числа ~d к битовому порядку " + Long.toBinaryString(~d));
        System.out.println("Приведение символа ~E к битовому порядку " + Integer.toBinaryString(~E));

    }
}
