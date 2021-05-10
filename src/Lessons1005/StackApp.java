package Lessons1005;

import java.time.LocalDate;

public class StackApp {

    public static void main(String[] args) {
        // in main we should react to it

            helper();
            //this code after "helper" is not executed if an exception is thrown
            //System.out.println("You will never see me");

    }

    public static void helper() {
        Stack s = new Stack(5);
        try {
            s.push(new Note(LocalDate.now(), "Einkaufsliste", "Eier, Milch, Gurken, Tomaten, Zucchini"));
            s.push(new Note(LocalDate.now(), "Anrufen", "Steffi, Toni, Hubsi, Anton"));
            s.push(new Note(LocalDate.now(), "Vatertags Geschenk organisieren", "Unterwäsche oder doch eine Krawate"));
            s.push(new Note(LocalDate.now(), "Vatertags Geschenk organisieren", "Unterwäsche oder doch eine Krawate"));
            s.push(new Note(LocalDate.now(), "Vatertags Geschenk organisieren", "Unterwäsche oder doch eine Krawate"));
            s.push(new Note(LocalDate.now(), "Vatertags Geschenk organisieren", "Unterwäsche oder doch eine Krawate"));

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        } catch(Exception e) {                      //super-class that catches all possible exceptions
            System.out.println("Anderer Fehler");
        } finally {
            System.out.println("And finally print this");
        }
    }
}
