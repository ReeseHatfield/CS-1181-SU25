public class Dog implements Animal {

    @Override
    public void makeNoise() {
        System.out.println("woof");
    }


    public void playFetch(){
        System.out.println("playing fetch");
    }


    @Override
    public void fly() {
        System.out.println("Dogs cannot fly");
    }
    
}
