/*
 * Make Truth Table for java
 * */

public class TruthTable {
    public static void main(String[] args) {

        boolean[] c = {false, true, false, true}; //truth table values for a
        boolean[] d = {false, false, true, true}; //truth table values for b

        System.out.println("p    |q    |p & q|p | q|p ^ q|!p");

        for (int i = 0; i < 4; i++) {
            boolean a = c[i];
            boolean b = d[i];

            switch (i) { //make table great again

                case (0):
                    System.out.println(a + "|" + b + "|" + (a & b) + "|" +
                            (a | b) + "|" + (a ^ b) + "|" + (!a));
                    break;
                case (1):
                    System.out.println(a + " |" + b + "|" + (a & b) + "|" +
                            (a | b) + " |" + (a ^ b) + " |" + (!a));
                    break;
                case (2):
                    System.out.println(a + "|" + b + " |" + (a & b) + "|" +
                            (a | b) + " |" + (a ^ b) + " |" + (!a));
                    break;
                case (3):
                    System.out.println(a + " |" + b + " |" + (a & b) + " |" +
                            (a | b) + " |" + (a ^ b) + "|" + (!a));
                    break;
                default:
                    System.out.println("Dont work!");
                    break;
            }

        }


    }
}
