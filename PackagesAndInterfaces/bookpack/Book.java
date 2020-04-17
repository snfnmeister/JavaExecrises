/*
 *
 * Examples of using packages
 *
 */

package bookpack;

public class Book { //public class
    protected String title;
    protected String author;
    protected int pages;

    public Book() {}

    public Book(String title, String author, int pages) { //public constructor
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

   public void show () { //public method
        System.out.println(title);
        System.out.println(author);
        System.out.println(pages);
//        System.out.println();
    }
}
