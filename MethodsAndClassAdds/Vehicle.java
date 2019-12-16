/*
 *
 * Java class declaration
 *
 */

class Vehicle {
    int passengers; //number of passengers
    int fuelcap;    //fuel tank capacity
    int mpg;        //fuel using per mile

    //add travel range() method
    void range() {
        System.out.println("on travel range -" + fuelcap * mpg + " miles.");
    }

}
