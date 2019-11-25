/*
 *
 * Demonstration of using Java access-modifiers
 *
 */

public class Access {

    public String colour;
    int weight;
    private int price;

    Access(String colour, int weight, int price) {
        this.colour = colour;
        this.weight = weight;
        this.price = price;
    }

    int getPrice() {    //getter for private field price
        return price;
    }

    void setPrice(int price) { //setter for private field price
        this.price = price;
    }


}
