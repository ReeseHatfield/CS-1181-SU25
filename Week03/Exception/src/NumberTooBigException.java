public class NumberTooBigException extends RuntimeException {
    public NumberTooBigException(String message){
        // logic 
        super(message);
    }


    public void printHello(){
        System.out.println("hello!");
    }
    
}
