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
}

