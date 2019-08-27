/*
 * Java Primitive Types
 *
 * byte (integer numbers, 1 byte size, range -128..127 );
 * short (integer numbers, 2 byte size, range -32768..32767);
 * int (integer numbers, 4 byte size, range -2147483648..2147483647);
 * long (integer numbers, 8 bytes size, range -9223372036854775808..9223372036854775807);
 * float (real numbers, 4 bytes size, range ~1,4*10-45..~3,4*1038);
 * double (real numbers, 8 bytes size, range ~4,9*10-324..~1,8*10308);
 * char (Unicode symbol, 2 bytes size, chars with equal number range 0..65535)
 * boolean (value true/false, 1 bytes size, range 0..1, 1 for true, 0 for false(?))
 *
 */

public class MainTypes {

    public static void main(String args[]) {

        byte typeByte = 127;
        short typeShort = 32767;
        int typeInt = 68;
        long typeLong = 922337203685477580L;
        float typeFloat = 123131313112312313131231313131313131331F;
        double typeDouble = 123123131313131231313133D;
        char typeChar = 'C';
        boolean typeBoolean = true;

        System.out.println("byte - " + typeByte);
        System.out.println("short - " + typeShort);
        System.out.println("int - " + (char) (typeInt + 1));
        System.out.println("long - " + typeLong);
        System.out.println("float - " + typeFloat);
        System.out.println("double - " + typeDouble);
        System.out.println("char - " + (int) typeChar);
        System.out.println("boolean - " + (typeBoolean ? 1 : 0));


    }
}
