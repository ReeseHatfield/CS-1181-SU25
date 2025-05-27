import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        Book b1 = new FictionBook(14.01, "Twilight");
        Chargable b2 = new FictionBook(14.13, "Great Expectation");

        chargeBook(b2, 5);
        Book b3 = new NonFictionBook(
            1002.1,
            "Conversations with Myself",
            "May 10th"
        );

        // class casting
        checkOut((Borrowable) b3);
    }

    private static ArrayList<Book> inventory = new ArrayList<>();

    public static void addBook(Book b) {
        System.out.println("processing " + b.getTitle());

        inventory.add(b);
    }

    public static void chargeBook(Chargable c, int age) {
        System.out.println("I am billing you" + c.getCharge(age));
    }

    public static void checkOut(Borrowable b) {
        System.out.println(
            "Make sure to have the book back by " + b.getReturnDate()
        );
    }
}
