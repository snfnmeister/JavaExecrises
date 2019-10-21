/*
 *
 * Java Scanner nextInt() method. Read and returns input integer number.
 *
 */

import java.util.Scanner;

public class ScannerNextInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you integer!");
        int num = sc.nextInt();
        System.out.println("You integer equals to: " + num);

    }

}
