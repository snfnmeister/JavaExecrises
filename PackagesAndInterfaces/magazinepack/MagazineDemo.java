/*
 *
 * Examples of using packages
 *
 */

package magazinepack;

import bookpack.Book;

public class MagazineDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book("Java: Beginner Guide", "Schildt", 450);
        books[1] = new Book("Java: Complete References", "Schildt", 670);
        books[2] = new Book("The Art of Java Style", "Schiltd and Holmes", 230);
        books[3] = new Book("Red Storm Rising", "Clancy", 310);
        books[4] = new Book("House on the Road", "Johnny Cage", 160);

        for (int i = 0; i < books.length; i++) books[i].show();
    }
}