/*
 * Make Truth Table for java
 * */

public class TruthTable {
    public static void main(String[] args) {


        boolean[] c = {false, true, false, true};
        boolean[] d = {false, false, true, true};

        System.out.println("p    |q    |p & q|p | q|p ^ q|!p");

        for (int i = 0; i < 4; i++) {
            boolean a = c[i];
            boolean b = d[i];

            System.out.println(a + "|" + b + "|" + (a & b) + "|" +
                    (a | b) + "|" + (a ^ b) + "|" + (!a));


        }


    }
}
