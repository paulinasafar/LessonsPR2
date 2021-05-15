package Bibliothek;

import java.util.ArrayList;
import java.util.List;

public class Bibliothek {

    protected List<Book> library;

    public Bibliothek() {
        this.library = new ArrayList<Book>();
    }

    public void addBook(Book b) {
        library.add(b);
    }

    public int countPages() {
        int total = 0;
        for (Book b : library) {
            total += b.getNrPages();
        }
        return total;
    }

    public double averagePages() {
        return countPages() / library.size();
    }

    public ArrayList<Book> booksByAuthor(String s) {
        ArrayList<Book> books = new ArrayList<Book>();

        for (Book b : library) {
            if (b.getAuthor().contains(s)) {
                books.add(b);
            } else if (s.equals(null)) {
                return null;
            }
        }
        return books;
    }


    public ArrayList<Book> findBook(String author1, String title1) {
            ArrayList<Book> b1 = new ArrayList<Book>();

        for (Book b : library) {
            if (b.match(author1, title1)) {
                b1.add(b);
            }
        }
        return b1;
    }

    @Override
    public String toString() {
        return "Bibliothek: " + library;
    }
}
