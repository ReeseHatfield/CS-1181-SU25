public class Pig extends Animal{

    @Override
    public void playFetch() {
        System.out.println("Pig plays fetch by ");
        super.walk(100);
    }

    @Override
    public void makeSound(){
        System.out.println("*oinking*");
    }
    
}
