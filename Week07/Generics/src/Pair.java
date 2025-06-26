public class Pair<T1 extends Comparable<T1>, T2> {
    
    private T1 thing1;
    private T2 thing2;

    public Pair(T1 thing1, T2 thing2){
        this.thing1 = thing1;
        this.thing2 = thing2;

    }


    public String toString(){
        return thing1.toString() + ": " + thing2.toString();
    }
}
