/*
*
* In Java using special class Object. In default this is superclass for all other classes
*
*/


public class ClassObject extends Object {


    public static void main(String[] args) {

        Doggo doggo = new Doggo("GafGafich");
//        Doggo dog = new Doggo ("GafGafich");
        Doggo dog = doggo;

//       methods that can be use from any objects
//       Doggo shiba = doggo.clone(); //method clone must be overriding

        System.out.println("Equals? - " + doggo.equals(dog)); //determine equals of objects
        System.out.println("Class of object? - " + dog.getClass());  //return class of object in run-time
        System.out.println("String description of object? - " + doggo.toString());  //return String that contains class description
        System.out.println("hashCode? - " + doggo.hashCode());


    }






}
