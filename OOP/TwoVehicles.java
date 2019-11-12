/*
 *
 * Make two object of Vehicles.class
 *
 */

public class TwoVehicles {

    public static void main(String[] args) {

        Vehicle minivan = new Vehicle();
        Vehicle sportscar = new Vehicle();

        int range1, range2;

//        set fields value in minivan object
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

//        set fields value in sportscar object
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;

//        travel range with full fuel tank
        range1 = minivan.fuelcap * minivan.mpg;
        range2 = sportscar.fuelcap * sportscar.mpg;

        System.out.println("minivan.passengers: " + minivan.passengers +  //using "\t" for tabulation
                "\tsportscar.passengers: " + sportscar.passengers +
                "\nminivan.fuelcap: " + minivan.fuelcap +
                "\t\tsportscar.fuelcap: " + sportscar.fuelcap +
                "\nminivan.mpg: " + minivan.mpg + "\t\t\tsportscar.mpg: " + sportscar.mpg + "\n");

        System.out.println("Minivan can transpose " + minivan.passengers +
                " passengers on travel range " + range1 + " miles");

        System.out.println("Sportscar can transpose " + sportscar.passengers +
                " passengers on travel range " + range2 + " miles");

    }
}
