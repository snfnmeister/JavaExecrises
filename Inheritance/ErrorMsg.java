/*
 *
 * Examples of using final keywords for variables
 *
 */

public class ErrorMsg {

    //error codes
    //const using with final keyword
    final int OUTERR = 0;
    final int INERR = 1;
    final int DISKERR = 2;
    final int INDEXERR = 3;

    String[] msgs = {
            "Output error",
            "Input error",
            "Don't have free memory!",
            "Index is out of diaposon"
    };

    //return error message
    String getErrorMsg(int i) {
        if (i >=0 & i < msgs.length)
            return msgs[i];
        else
            return "Undefined error code!";
    }

}
