/*
 *
 * Examples of using packages
 *
 */

package magazinepack;

//import bookpack.Book; //using class from other package

public class MagazineDemo {
    public static void main(String[] args) {
        bookpack.Book[] books = new bookpack.Book[5]; //use appeal thru package (thru dot)
        books[0] = new bookpack.Book("Java: Beginner Guide", "Schildt", 450);
        books[1] = new bookpack.Book("Java: Complete References", "Schildt", 670);
        books[2] = new bookpack.Book("The Art of Java Style", "Schiltd and Holmes", 230);
        books[3] = new bookpack.Book("Red Storm Rising", "Clancy", 310);
        books[4] = new bookpack.Book("House on the Road", "Johnny Cage", 160);

        for (int i = 0; i < books.length; i++) books[i].show();
    }
}