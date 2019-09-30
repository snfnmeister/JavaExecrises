/*
 *
 * Java The switch Statement: The switch statement can have a number of possible execution paths.
 * A switch works with byte, short, char, and int primitive data types.
 * It also works with enumerated types, the String class (added in Java SE 7 and later) and
 * a few special classes that wrap certain primitive types: Character, Byte, Short and Integer.
 *
 * syntax: switch (expression) {
 *
 * case value1: break;
 * case value2: break;
 * case valueN: break;
 * default:
 * }
 *
 */

public class SwitchOperator {

    public static void main(String[] args) {

        int day = 5;
        String DayOfWeek;
        switch (day) {  //switch block
            case 1:
                DayOfWeek = "Monday";
                break;
            case 2:
                DayOfWeek = "Tuesday";
                break;
            case 3:
                DayOfWeek = "Wednesday";
                break;
            case 4:
                DayOfWeek = "Thursday";
                break;
            case 5:
                DayOfWeek = "Friday";
                break;
            case 6:
                DayOfWeek = "Saturday";
                break;
            case 7:
                DayOfWeek = "Sunday";
                break;
            default:
                DayOfWeek = "IDK";
                break;
        }
        System.out.println("Day " + day + " - it'is - " + DayOfWeek + "!");
    }
}
