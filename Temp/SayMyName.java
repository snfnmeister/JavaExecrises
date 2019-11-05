public class SayMyName {

    public static void main(String[] args) {

        String I = "I\nI\nI\nI\nI";
        String G = " \nGGGGG" +
                "\nG     G" +
                "\nG     " +
                "\nG    GGG" +
                "\nG     G" +
                "\n GGGGG";
        String O = "\n00000 " +
                "\n0   0 " +
                "\n0   0 " +
                "\n00000 ";
        String R = "\nRRRR" +
                "\nR   R" +
                "\nRRR" +
                "\nR  R" +
                "\nR   R";


//        System.out.println(I);
//        System.out.println(G);
//          System.out.println(O);
//        System.out.println(R);
        String name = "  I      GGGG       0000      RRRR      \n" +
                      "  I     G          0    0     R   R     \n" +
                      "  I     G   GG     0    0     R R       \n" +
                      "  I     G    G     0    0     R  R      \n" +
                      "  I      GGGG       0000      R    R    \n";

//        System.out.print(I + "  " + G + "  " + O + "  " + R + "  ");
        System.out.println(name);

    }
}
