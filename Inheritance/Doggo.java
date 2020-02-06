/*
 *
 * Demonstration of working Inheritance in Java
 * This is SubClass of Animal Class
 *
 */

public class Doggo extends Animal {

    private String doggoName;

    public Doggo(String doggoName) { //constructor
        this.doggoName = doggoName;
    }

    String getDoggoName() {
        return doggoName;
    }
}


