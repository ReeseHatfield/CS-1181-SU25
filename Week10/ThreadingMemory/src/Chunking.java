import java.util.ArrayList;
import java.util.List;

public class Chunking {
    public static void main(String[] args) throws InterruptedException {
        int start = 0;
        int end = 100;
        int numThreads = 4;
        int chunkSize = (end - start) / numThreads;

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            int rangeStart = start + i * chunkSize;


            int rangeEnd;
            if (i == numThreads - 1) {
                rangeEnd = i;
            }
            else {
                rangeEnd = rangeStart + chunkSize;
            }

            Thread thread = new Thread(() -> {
                for (int j = rangeStart; j < rangeEnd; j++) {
                    System.out.println(Thread.currentThread().getName() + " working on: " + j);
                }
            });

            threads.add(thread);
            thread.start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("All threads finished.");
    }
}
