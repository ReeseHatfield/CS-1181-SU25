public class CountingThread extends Thread {
    
    private int start;

    public CountingThread(int start) {
        this.start = start;
    }


    public void run() {
        for(int i = start; i < start + 100; i++) {
            System.out.println(i);
        }


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
