public class Bird  implements Animal, TwoLeggedThing{

    @Override
    public void makeNoise() {
        System.out.println("tweet");
    }

    @Override
    public void run(String s) {
        System.out.println("*hops along*");
    }


    public void fly(){
        System.out.println("I am a flying bird");
    }


    
}
