/*
 *
 * Java Array length properties.
 * Syntax: arrName.length - it is properties, not method. Use w/o "()";
 *
 */
public class ArrayLength {

    public static void main(String[] args) {

        int[] arrName = new int[15];
        int arrLength = arrName.length;
        System.out.println("Array length = " + arrLength);

        int[][] dimArray = {{1, 2, 3}, {2, 3}, {}};
        int dimLengthRow1 = dimArray[0].length; //first row length
        int dimLengthRow2 = dimArray[1].length; //second row length
        int dimLengthRow3 = dimArray[2].length; //third row length

        System.out.println("Length of 1st row = " + dimLengthRow1);
        System.out.println("Length of 2nd row = " + dimLengthRow2);
        System.out.println("Length of 3rd row = " + dimLengthRow3);
    }
}
