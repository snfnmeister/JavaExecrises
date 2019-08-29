/*
 *
 * Java all Arithmetic Operators
 *
 */


public class ArithmeticOperators {

    public static void main(String[] args) {

        double a = 14D;
        double b = 88D;

        System.out.println("Сумма чисел - оператор '+': a + b = " + (a + b));
        System.out.println("Вычитание чисел - оператор '-': a - b = " + (a - b));
        System.out.print("Деление чисел - оператор '/': a / b = " + (a / b));
        System.out.println(" (Важно проверять деление на ноль!)");
        System.out.println("Умножение чисел - оператор '*': a * b = " + (a * b));
        System.out.println("Остаток от деления - оператор '%': b % a = " + (a % b));
        System.out.println("Инкремент - оператор '++': a++ = " + a++); // post-increment
        System.out.println(a);
        System.out.println("Инкремент - оператор '++': ++a = " + ++a); // pre-increment

        System.out.println("Декремент - оператор '--': a-- = " + a--); // post-decrement
        System.out.println(a);
        System.out.println("Декремент - оператор '--': --a = " + --a); // pre-decrement

    }
}
