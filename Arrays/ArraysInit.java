/*
 *
 * Java Arrays initializations
 * Initialization syntax: type[] arrName //preferred declaration by Java Code Style
 *                        type arrName[] //CodeStyle declaration that came from C++
 * Arrays it is object in Java
 *
 */
public class ArraysInit {

    public static void main(String[] args) {

        int[] arr = new int[3];    //array length can't be changed after creating;
        for (int i : arr) {
            System.out.println(i); //arr[] filled with default values: for numbers - 0
            //for boolean - false
            //for references/objects - null
        }

        char[] charArr = new char[1];
        for (char j : charArr) {   //if use char variable in foreach loop that we will see "empty space"
            System.out.println(j); //but if use integer variable - it will get 0 values
        }

        String[] strArr = new String[3];
        //set strArr values by indexes
        strArr[0] = "Hello ";
        strArr[1] = "World";
        strArr[2] = "!";
        for (String str : strArr) {
            System.out.print(str);
        }

        String[] weekDays = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] winterMonth = {"December", "January", "February"};
        System.out.println("\n" + weekDays);

    }
}
