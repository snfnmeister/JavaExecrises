/*
 *
 * Examples how to return object data type from method;
 *
 */

public class ErrorInfo {

    String msgs[] = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапозона",
    };

    Err getErrorInfo(int errCode) {                  //we have method that returns object Err
        if (errCode >= 0 & errCode < msgs.length)
            return new Err(errCode, msgs[errCode]);  //create new object with definite fields
        else
            return new Err(0, "Несуществующий код ошибки");
    }
}
