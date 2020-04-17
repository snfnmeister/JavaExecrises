/*
 *
 * Examples of using protected keyword
 *
 */


package bookpackext;
//import bookpack.*;

public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook books[] = new ExtBook[5];

        books[0] = new ExtBook("Java: Beginner Guide", "Schildt", 450, "PiterPub");
        books[1] = new ExtBook("Java: Complete References", "Schildt", 670, "PiterPub");
        books[2] = new ExtBook("The Art of Java Style", "Schiltd and Holmes", 230, "Osborne/McGraw");
        books[3] = new ExtBook("Red Storm Rising", "Clancy", 310, "Putnam");
        books[4] = new ExtBook("House on the Road", "Johnny Cage", 160, "Viking");

        for (int i = 0; i < books.length; i++) books[i].show();

//        find books by author
        System.out.println("Showing all books by Schildt:");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == "Schildt")
                books[i].show();
        }

//        books[0].title = "title" - don't have access


    }
}
