/*
 *
 * Java nextLine() method. Read and returns entered String.
 *
 */

import java.util.Scanner;

public class ScannerNextLine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you data!");

        while (true) {
            String data = sc.nextLine();
            if (data.equalsIgnoreCase("stop")) { //  '==' for compare references, 'equals' for values
                System.out.println("Stopped..");
                break;
            }
            System.out.println(data);

        }
    }
}
