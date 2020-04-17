/*
 *
 * Examples of using protected keyword
 *
 */

package bookpackext;

import bookpack.Book;

public class ExtBook extends Book {

    private String publisher;

    public ExtBook(String title, String author, int pages, String publisher) {
        super(title, author, pages);
        this.publisher = publisher;
    }

    //setter and getter for variable publisher of this class
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    //this is getters and setters for variables of superclass. We can use it there because they are have "protected"
    //modifier
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return pages;
    }

    public void setNumPages(int pages) {
        this.pages = pages;

    }

    @Override
    public void show() {
        super.show();
        System.out.println(publisher + "\n");
    }
}
