/*
 *
 * Java String.hashCode() method. This method returns the hash code for the String. Hash code value is used in hashing
 * based collections like HashMap, HashTable and etc. This method must be overridden in every class which overrides
 * equals() method.
 * For string hashCode computed as:
 *  s[0]*31^(n-1) + s[1]*31^(n-2) + … + s[n-1] -
 *  where:
 *       s[i] – is the ith character of the string
 *       n – is the length of the string, and
 *       ^ – indicates exponentiation
 *
 * syntax: public int hashCode()
 *
 */
public class StringHashCode {

    public static void main(String[] args) {

        String str1 = "The super new String value!";
        String str2 = "It is snowy days today!";

//        hashCode presented by int32 value (4 bytes in size)
//        different hashCode means different Objects
//        equals hashCode do not provide equals Objects
//        beware of Collisions
        System.out.println(str1 + " - hashCode: " + str1.hashCode());
        System.out.println(str2 + " - hashCode: " + str2.hashCode());

//      identityHashCode - 5th ways to generate hashCode
        System.out.println("IdentityHashCode of str1: " + System.identityHashCode(str1));
        System.out.println("IdentityHashCode of str2: " + System.identityHashCode(str2));


    }
}
