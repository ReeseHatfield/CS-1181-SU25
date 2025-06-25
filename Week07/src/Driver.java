import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Driver {

    public static void main(String[] args) {
        // ArrayList<sdfjshfd> = new ArrayList<>()
        //

        // FI FO
        // Queue<Integer> q = new ArrayDeque<>();
        PriorityQueue<CustomClass> pq = new PriorityQueue<>();
        pq.offer(new CustomClass(6));
        pq.offer(new CustomClass(7));
        pq.offer(new CustomClass(0));
        pq.offer(new CustomClass(5));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        // System.out.println("Qs:");
        // Queue<Integer> q = new LinkedList<>();

        // q.offer(2);
        // q.offer(4);
        // q.offer(6);
        // q.offer(8);
        // q.offer(10);

        // System.out.println(q.poll());
        // System.out.println(q.poll());
        // System.out.println(q.poll());

        // System.out.println("PQs:");
        // PriorityQueue<CustomClass> pq = new PriorityQueue<>();

        // pq.offer(new CustomClass(10));
        // pq.offer(new CustomClass(14));
        // pq.offer(new CustomClass(16));
        // pq.offer(new CustomClass(5));

        // System.out.println(pq.poll());
    }
}
