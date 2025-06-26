import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Driver {
    public static void main(String[] args) {

        // Queue<String> q = new ArrayDeque<>();


        // q.offer("hello");
        // q.offer("World");
        // q.offer("name");

        // // String s = q.peek();

        // System.out.println(q.poll());
        // System.out.println(q.poll());


        // PriorityQueue<CustomClass> pq = new PriorityQueue<>();

        // pq.offer(new CustomClass(5));
        // pq.offer(new CustomClass(7));
        // pq.offer(new CustomClass(9));

        // System.out.println(pq.poll());

        // pq.offer(new CustomClass(-1));

        // performAction("some String");


        Box<Integer> b1 = new Box<>(5);
        Box<String> b2 = new Box<>(new String("Hello"));
        Box<CustomClass> b3 = new Box<>(new CustomClass(6));

        // System.out.println(b2);


        Pair<CustomClass, String> myPair = new Pair<>(new CustomClass(5), "hello");

        // System.out.println(myPair);


        CustomArrayList<String> list = new CustomArrayList<>(10);
        list.add("Hello");
        list.add("world");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("Reese");


        System.out.println(list);


        CustomArrayList<Integer> list2 = new CustomArrayList<>(10);

        list2.add(5);
        list2.add(7);
        list2.add(3);
        list2.add(4);
        list2.add(2);


        System.out.println(list2.get(7));




    }


    public static void performAction(Object thing){

    }

    // header for class "Number"


    // public class Thing extends Number implements Comparable<Thing>
}