/*
 *
 * Java literals
 *
 */

public class Literal {

    public static void main(String[] args) {
        int a = 10;
        long b = 10L;
        double c = 10.1;
        float d = 10.1F;
        int e = 1_000_000;
        double j = 123_123.1234_1;
        int hex = 0x1337;
        int oct = 0123;
        int bin = 0b0011;

        //literals
        System.out.println("a = " + a + "\n"
                + "b = " + b + "\n"
                + "c = " + c + "\n"
                + "d = " + d + "\n"
                + "e = " + e + "\n"
                + "j = " + j + "\n"
                + "hexnum = " + String.format("%x", hex) + "\n"
                + "octal = " + String.format("%o", oct) + "\n"
                + "binary = " + Integer.toBinaryString(bin) + "\n");

        //symbols for control sequence
        System.out.println("1) Hello\'World!");
        System.out.println("2) Hello\"World!");
        System.out.println("3) Hello\\World!");
        System.out.println("4) Hello\rWorld!");
        System.out.println("5) Hello\nWorld!");
        System.out.println("6) Hello\fWorld!");
        System.out.println("7) Hello\tWorld!");
        System.out.println("8) Hello\bWorld!");
        System.out.println("9) Hello\123World!");
        System.out.println("10) Hello\u3500World!");


    }
}
