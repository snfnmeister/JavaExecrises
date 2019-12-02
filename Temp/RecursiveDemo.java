public class RecursiveDemo {
    int i; //counter

    public void Recursion() {

        i++;
        System.out.println("it is recursion! - " + i);
        if (i <= 99) {
            Recursion();
        }
    }
}
