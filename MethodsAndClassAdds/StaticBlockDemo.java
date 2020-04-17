/*
*
* Example of using static blocks in Java
* */
public class StaticBlockDemo {

    public static void main(String[] args) {

        StaticBlock block = new StaticBlock();

        StaticBlock.x = 5; //will do not affect to StaticBlock.y;
        System.out.println("x value: " + StaticBlock.x);
        System.out.println("y value: " + StaticBlock.y);

        StaticBlock.staticMethod();



    }
}
