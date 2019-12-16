/*
 *
 * Example of using Non-static nested (inner) class
 * syntax:
 *        class OuterClass {
          ...
              class NestedClass {
              ...
              }
          }
 *
 */

public class Outer { //creating outer class

    private String str;

    Outer(String str) {
        this.str = str;
    }

    void Analyze() {
        Inner inOb = new Inner(); //creating object of Inner class
        System.out.println("String length: " + inOb.length());
        System.out.println("String 1st symbol: " + inOb.firstSymbol());
        System.out.println("String last symbol: " + inOb.lastSymbol());
    }

    //inner class with methods that using for some needs of Outer class
    class Inner {
        int strLength;

        int length () {
            strLength = str.length();
            return strLength;
        }

        char firstSymbol () {
            return str.charAt(0);
        }

        char lastSymbol () {
            return str.charAt(strLength-1);
        }
    }

}
