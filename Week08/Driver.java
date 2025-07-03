import java.util.*;

public class Driver {

    public static void main(String[] args) {

        //Map
        // keys -> value


        // ADTS
        // Lists -> sequential
        // Stacks -> LIFO
        // Queues -> PQs -> FIFO
        // Maps -> key/value pair

        Map<String, Integer> map = new TreeMap<>();

        map.put("Reese", 99);
        map.put("Hello", 600);
        map.put("World", 4);


        System.out.println(map.get("Reeasdfasdfse"));

        System.out.println(map);


        // PriorityQueue<Student> pq = new PriorityQueue<>();
        // pq.offer(new Student("Charlie"));
        // pq.offer(new Student("Bob"));
        // pq.offer(new Student("asdfasdf"));
        // pq.offer(new Student("Alice"));
        // pq.offer(new Student("cvcbncvbn"));
        // pq.offer(new Student("dfgh"));
        // pq.offer(new Student("uiopuiop"));

        // System.out.println(pq);


        // Queue<String> q = new LinkedList<>();
        // q.offer("hello");
        // q.offer("world");
        // q.offer("bottle");

        // System.out.println(q.poll());
        // System.out.println(q.poll());
        // System.out.println(q.poll());


        // Stack<String> s = new Stack<>();

        // s.push("hello");
        // s.push("world");
        // s.push("bottle");

        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());

        // int numInsertions = 500_000;
        
        // double timeTakenArrayList = timePrepend(new ArrayList<String>(), numInsertions);
        // System.out.println("ArrayList took " + timeTakenArrayList + " for " + numInsertions + " insertions");

        // double timeTakenLinkedList = timePrepend(new LinkedList<String>(), numInsertions);
        // System.out.println("LinkedList took " + timeTakenLinkedList + " for " + numInsertions + " insertions");


        //asdfasdf


        //asdfas
    }


    public static double timePrepend(List<String> l, int numInsertions){

        long startTime = System.currentTimeMillis();

        for(int i = 0; i < numInsertions; i++){

            // prevent string pool caching I think?
            int index = 0;
            l.add(0, "inserted at index " + index); 
        }

        long endTime = System.currentTimeMillis();


        return (endTime - startTime) / 1000.0;

    }
}