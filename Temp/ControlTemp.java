/*
 *
 * Working Temp
 *
 */

public class ControlTemp {

    public boolean checkError(double M, double Control) {
        if (M < 9 & Control == 0)
            return true;
        else if (M > 10 & Control == 1)
            return true;
        else
            return false;

    }

    public boolean checkErorrEz(double M, double Control) {
        return (M < 9 & Control == 0) || (M > 10 & Control == 1) ? true : false;
    }
}

