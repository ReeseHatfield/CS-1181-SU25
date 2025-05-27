public class Dog extends Animal {

    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void playFetch() {
        System.out.println("Dog plays fetch normally by ");
        super.walk(50);
    }


    public void wagTail(){
        System.out.println("wags tail...");
    }

    @Override
    public void makeSound() {
        System.out.println("*barking*");
    }
}
