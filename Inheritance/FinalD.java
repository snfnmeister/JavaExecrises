/*
 *
 * Examples of using final keywords for variables
 *
 */

public class FinalD {

    public static void main(String[] args) {
        ErrorMsg err = new ErrorMsg();

        //In methods call using constants which was initializing with final keyword
        System.out.println(err.getErrorMsg(err.INERR));
        System.out.println(err.getErrorMsg(2));




    }
}
