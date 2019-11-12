/*
 *
 * Using  Vehicle.class
 *
 */

class VehicleDemo {

    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        int range;

//        set field values in minivan object
        minivan.passengers = 7;
        minivan.fuelcap = 20;      //using .dot notation for access to variable instance
        minivan.mpg = 21;

//        calculate travel range with full fuel tank
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can transpose " + minivan.passengers +
                " passengers on travel range " + range + " miles");


    }
}
