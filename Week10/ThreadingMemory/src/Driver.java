public class Driver {
    static boolean running = true;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {

            System.out.println("thread started");
            while (Driver.running) {
                // do some work
            }
            System.out.println("thread finished its work");


        });

        thread.start();

        Thread.sleep(1000);
        
        // statically set thing to false
        System.out.println("Telling thread to stop its work");
        Driver.running = false; 

        thread.join();
        System.out.println("reached end of main");



        /*
         * 
         * 
         *  Counter counter = new Counter();

            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            });

            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 1000; i++) {
                    counter.increment();
                }
            });
         */
    }
}
