import java.util.ArrayList;
import java.util.Collections;

public class Driver {

    private static ArrayList<Book> inventory = new ArrayList<>();
    public static void main(String[] args) {

        
        Book b1 = new FictionBook(56.4, "Harry Potter", "Rowling");
        b1.setDDNumber(-10.0);
        // try {
        //     // ...
        // }
        // catch(BadDDNumberException bddne){
        //     System.out.println("You cant set the DD number to be that " + bddne.getMessage() );
        // }
        // if(b1 instanceof FictionBook){
        //     System.out.println("b1 is a fictionbook");
        //     System.out.println((FictionBook) b1 );
        // }
        // else if(b1 instanceof NonFictionBook){
        //     System.out.println("b1 is a non fiction book");
        //     System.out.println((NonFictionBook) b1 );

        // }

        // System.out.println((NonFictionBook) b1);



        // Book b1 = new FictionBook(456.876, "Great Expectations", "Mark Twain");
        // Book b2 = new NonFictionBook(19.345, "Twilight");
        // Book b3 = new NonFictionBook(19.345, "Aba: A memoir");
        // Book b4 = new NonFictionBook(19.345, "Zebras: A retrospective");


        // b1 -> instance of non fiction book
        // NonFictionBook b1 = new NonFictionBook(405.456, "Conversations with Myself");
        // // b2 -> whereever b1s memory is
        // NonFictionBook b2 = new NonFictionBook(b1);
        // b2.setDDNumber(900.123);

        // System.out.println(b1);
        // System.out.println(b2);

        // System.out.println(b1);
        // System.out.println(b2);

        // FictionBook b = new Book();
        // high level = concrete on the right
        // high -> low = downcasting
        // low -> high = upcasting


        // String s = "hello world";

        // addBookToInventory(b1);
        // addBookToInventory(b2);
        // addBookToInventory(b3);
        // addBookToInventory(b4);
        // System.out.println(inventory);
    
        // Collections.sort(inventory, new AlphaComparator());

        // System.out.println();
        // System.out.println();
        // System.out.println(inventory);

        // LEFT = RIGHT
        // COMPILE TIME = RUN TIME

        // System.out.println(b1.checkOut());
        // System.out.println(b2.checkOut());

        // rob((Chargeable) b1, 97);


        // rob(new Chargeable() {

        //     @Override
        //     public int getCharge(int age) {
        //         return 75;
        //     }
            
        // }, 10);
    }

    
    public static void addBookToInventory(Book b){

        // b.getAuthor();
        inventory.add(b);
    }


    public static void rob(Chargeable c, int age){
        System.out.println("You are being robbed for " + c.getCharge(age));
    }

}
