public abstract class Animal implements MakeNoise {
    // behaves the same 
    public void walk(int distance){
        System.out.println("This animal is walking " + distance + "meters");
    }


    // this behaves differently based on who the child is
    public abstract void playFetch();
}
