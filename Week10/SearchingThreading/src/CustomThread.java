import java.util.Random;

public class CustomThread extends Thread {


    
    private long timeToWait;
    private String name;



    public static volatile int result;

    public CustomThread(long timeInMillis, String name) {
        this.timeToWait = timeInMillis;

        this.name = name;
    }

    @Override
    public void run() {

        System.out.println(name);
        System.out.println("Running in a separate thread");


        try {
            Thread.sleep(this.timeToWait);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



        System.out.println("result currently is " + CustomThread.result);
        Random rng = new Random();
        CustomThread.result += rng.nextInt(10);

        System.out.println("Finished running");
    }
}
