/*
 *
 * Demonstration of working Inheritance in Java
 * This is SubClass
 *
 */

public class Cat extends Animal {

    private String catName;

    public Cat(String catName) {
        this.catName = catName;
    }

    String getCatName() {
        return catName;
    }
}
