package Bibliothek;

public class Book {

    protected String author;
    protected String title;
    protected int nrPages;

    public Book(String author, String title, int pages) {
        this.author = author;
        this.title = title;
        this.nrPages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNrPages() {
        return nrPages;
    }

    public boolean match(String author1, String title1) {
        if(author1.contains(author1) && title1.contains(title1)) {
                return true;
            }
            System.out.println("No such author");
            return false;
        }

    @Override
    public String toString() {
        return "  Book: " + author + ", " + title + ", " + getNrPages();
    }
}
