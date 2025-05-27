import java.io.IOException;

public class Driver {

    public static void main(String[] args){


        Animal a = new Dog("Fiddo");

        Animal p = new Pig();
        p.playFetch();



        // int result = performDivide();

        // System.out.println("Result was: " + result);


    }

    // passing around interfaces (and abs classes)
    // is dynamic dispatch
    public void doThing(MakeNoise mn){
        mn.makeSound();

    }

    public static int performDivide(){

        try {

            int numerator = 57;
            int denominator = 1;

            int result = divide(numerator, denominator);
            // stop execution -> jump to catch block

            return result;
            

        } catch (ArithmeticException ae){
            System.out.println("Oops, you tried to divide by 0");
            ae.printStackTrace();
            
            return 0;

        } catch (NumberTooBigException ntbe) {

            System.out.println("oops, you tried to divide a number too big");
            System.out.println(ntbe.getMessage());
            return 100;
        }
        catch (Exception e){
            System.out.println("I have no clue what went wrong");
            return -1;
        }
        finally {
            System.out.println("finally was ran!");
        }
        
        
    }


    public static int divide(int n, int d) throws NumberTooBigException, Exception {
        if(d == 0) {
            // extends RuntimeException
            throw new ArithmeticException("denominator cannot be 0");
        }

        if(n > 100){
            // extends Exception
            throw new NumberTooBigException("you cannot divide numbers as big as " + n);
        }


        if(n == 57){
            throw new NullPointerException("oopsies");
        }
        // if bad condition
            // return early

        // actual function logic
        // guard clause

        return n / d;


    }


//     public static void doThing()  {
//         performAct();
//     }

//     public static void performAct() {
//         throw new ArithmeticException("something went wrong");
//     }
}