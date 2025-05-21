import java.util.ArrayList;

public class Driver {

    public static void main(String[] args) {
        Book b1 = new FictionBook(456.876, "Great Expectations", "Mark Twain");
        Book b2 = new NonFictionBook(19.345, "Twilight");

        // FictionBook b = new Book();
        // high level = concrete on the right
        // high -> low = downcasting
        // low -> high = upcasting

        addBookToInventory(b1);
        // LEFT = RIGHT
        // COMPILE TIME = RUN TIME

        // System.out.println(b1.checkOut());
        System.out.println(b2.checkOut());

        rob((Chargeable) b1, 97);


        rob(new Chargeable() {

            @Override
            public int getCharge(int age) {
                return 75;
            }
            
        }, 10);
    }

    private static ArrayList<Book> inventory = new ArrayList<>();
    
    public static void addBookToInventory(Book b){

        // b.getAuthor();
        inventory.add(b);
    }


    public static void rob(Chargeable c, int age){
        System.out.println("You are being robbed for " + c.getCharge(age));
    }

}
