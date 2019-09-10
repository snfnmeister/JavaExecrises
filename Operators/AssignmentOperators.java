
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

        System.out.println("Оператор присваивания '=': C = A + B - " + (C = (A + B)));
        System.out.println("Оператор +=: C += A эквивалентно C = C + A = " + (C += A));
        System.out.println("Оператор -=: C -= B эквивалентно C = C - B = " + (C -= B));
        System.out.println("Оператор *=: C *= A эквивалентно C = C * A = " + (C *= A));
        System.out.println("Оператор /=: C /= B эквивалентно C = C / B = " + (C /= B));
        System.out.println("Оператор %=: C %= A эквивалентно C = C % A = " + (C %= 4));

    }
}
