
/*
 *
 * Java Assignment Operators
 *
 */

public class AssignmentOperators {

    public static void main(String[] args) {

        float A = 10F;
        float B = 20F;
        float C = 0;
        int D = -4;

        System.out.println("Оператор присваивания '=': C = A + B - " + (C = (A + B)));
        System.out.println("Оператор +=: C += A эквивалентно C = C + A = " + (C += A));
        System.out.println("Оператор -=: C -= B эквивалентно C = C - B = " + (C -= B));
        System.out.println("Оператор *=: C *= A эквивалентно C = C * A = " + (C *= A));
        System.out.println("Оператор /=: C /= B эквивалентно C = C / B = " + (C /= B));
        System.out.println("Оператор %=: C %= A эквивалентно C = C % A = " + (C %= 4));
        System.out.println("Оператор >>=: D >>= 1 эквивалетно D = D >> 1 = " + (D >>= 1)); //value divided by 2
        System.out.println("Оператор <<=: D <<= 1 эквивалетно D = D << 1 = " + (D <<= 1)); //value multiplied by 2
        System.out.println("Оператор >>>=: D >>>= 1 эквивалетно D = D >>> 1 = " + (D >>>= 1)); //div by 2 + high zero bit


    }
}
