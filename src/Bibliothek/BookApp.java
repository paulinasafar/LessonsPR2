package Bibliothek;

public class BookApp {

    public static void main(String[] args) {


        Book b1 = new Book("J. K. Rowling", "Harry Potter 1", 495);
        Book b2 = new Book("J. K. Rowling", "Harry Potter 2", 422);
        Book b3 = new Book("J. K. Rowling", "Harry Potter 3", 328);
        Book b4 = new Book("Emily Bronte", "Wuthering Heights", 214);
        Book b5 = new Book("Shakespeare", "A Midsummer Night's Dream", 289);
        Book b6 = new Book("Stephen Hawking", "A Brief History of Time", 178);

        Bibliothek library1 = new Bibliothek();
        library1.addBook(b1);
        library1.addBook(b2);
        library1.addBook(b3);
        library1.addBook(b4);
        library1.addBook(b5);

        System.out.println(library1);
        System.out.println("Total Pages: " + library1.countPages());
        System.out.println("Average Pages: " + library1.averagePages());
        System.out.println("Author: " + library1.booksByAuthor("spea"));
        System.out.println("Author: " + library1.booksByAuthor("dafa"));
        System.out.println("Find book: " + library1.findBook("awk", "rief"));



    }
}
