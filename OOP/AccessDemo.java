/*
 *
 * Access modifiers demonstration
 * fields:
 *        public String colour;
 *        int weight;
 *        private int price;
 *
 * !Private field works thru constructor! //why not? private field can be used by other members of the same class
 *
 */

public class AccessDemo {

    public static void main(String[] args) {

        Access access = new Access("Black", 500, 200);

//        set "private" value
//        access.setPrice(10);
        System.out.println("private field price set to: " + access.getPrice());

//        set "public" value
//        access.colour = "white";
        System.out.println("colour set to: " + access.colour);

//        set "default" value
//        access.weight = 600;
        System.out.println("weight set to: " + access.weight);


    }
}
