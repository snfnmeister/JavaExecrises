/*
 *
 * Java Multi-dimensional arrays initializations
 * syntax:
 * type[][] arrName = new type[][] - 1st "[]" for rows and 2nd "[]" for columns (rowXcolumns)
 *
 */
public class ArrayDimensional {

    public static void main(String[] args) {
//      diff ways to initialization multidimensional arrays
        int[][] matrixA = new int[][]{{1, 2, 3}, {4, 5, 6}};
        String[][] matrixB = {{"One", "Two"}, {"Three", "Four"}};
        char[][] matrixC = new char[3][3];
        matrixC[0][0] = 'A';
        matrixC[0][1] = 'B';
        matrixC[0][2] = 'C';


    }
}
