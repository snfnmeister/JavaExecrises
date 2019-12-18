/*
*
* Example of using overloading methods with variable numbers of args
*
*/

public class VarArgsOverloading {

    static void vaTest(int...v) { //argument with variable length must be last in method declaration!
        System.out.println("vaTest(int...v) - number of args = " + v.length);
        System.out.println("Args: ");
        int j = 0;

       for(int i : v) {
           System.out.println(" args" + j + ": " + i);
           j++;
       }
    }

    // will not work because of uncertainty. Compiler can't choose which method use:
    // vaTest(int..v) or vaTest(int i, int..v). E.g: vaTest(1)
//    static void vaTest(int i, int...v) { //argument with variable length must be last in method declaration!
//        System.out.println("vaTest(int...v) - number of args = " + v.length);
//        System.out.println("Args: ");
//
//        for(int i = 0; i < v.length; i++) {
//            System.out.println(" args" + i + ": " + v[i]);
//        }
//        System.out.print("\n");
//    }


    static void vaTest(boolean...v) { //in method declaration cannot using two arguments with variable length
        System.out.println("vaTest(boolean...v) - number of args = " + v.length);
        System.out.println("Args: ");

        for(int i = 0; i < v.length; i++) {
            System.out.println(" args" + i + ": " + v[i]);
        }
        System.out.println();
    }

    static void vaTest(String msg, char...v) { //in method declaration cannot using two arguments with variable length
        System.out.println("vaTest(String msg, char...v) - number of args = " + v.length);
        System.out.println("Args: \n" + "msg: " + msg);

        for(int i = 0; i < v.length; i++) {
            System.out.println(" args" + i + ": " + v[i]);
        }
        System.out.println();
    }



    public static void main(String[] args) {
        vaTest(10,20,30,40,50);
        vaTest(false,false,true,false,false);
        vaTest("Hello", 'W','o','r','d','!');
//        vaTest(); don't work because vaTest() method with empty arguments not specified
    }
}
