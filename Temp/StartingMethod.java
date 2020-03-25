/*
 *
 * Class for starting some method
 *
 */

public class StartingMethod {
    public static void main(String[] args) {
        ControlTemp temp1 = new ControlTemp();
        boolean errorStatus = false;
        errorStatus = temp1.checkError(15, 0);
        System.out.println(errorStatus);
        errorStatus = temp1.checkErorrEz(15, 0);
        System.out.println(errorStatus);

    }
}
