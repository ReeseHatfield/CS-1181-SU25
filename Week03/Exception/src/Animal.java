public abstract class Animal implements MakeNoise {
    public void walk(int distance){
        System.out.println("This animal is walking " + distance + "meters");
    }


    public abstract void playFetch();
}
