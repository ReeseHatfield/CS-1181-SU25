import java.util.*;

public class SleepSort {

    public static volatile ArrayList<Integer> sorted = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(38, 25, 43, 3, 8, 83, 10)
        );

        sleepSort(list);
        System.out.println(sorted);
    }

    public static void sleepSort(ArrayList<Integer> list) {
        long deltaTimeMillis = 10;
        ArrayList<Thread> threads = new ArrayList<>();

        for (Integer i : list) {
            threads.add(
                new Thread(() -> {
                    try {
                        Thread.sleep(i * deltaTimeMillis);
                    } catch (InterruptedException e) {}
                })
            );
        }

        for (Thread t : threads) {
            try {
                t.join();
                sorted.add()
            } catch (InterruptedException e) {}
        }
    }
}
