import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Driver {

    public static void main(String[] args) {


        int numInsertions = 1_000_000;
        
        double timeTakenArrayList = timeInsertAtBegining(new ArrayList<String>(), numInsertions);
        System.out.println("ArrayList took " + timeTakenArrayList + " for " + numInsertions + " insertions");

        double timeTakenLinkedList = timeInsertAtBegining(new LinkedList<String>(), numInsertions);
        System.out.println("LinkedList took " + timeTakenLinkedList + " for " + numInsertions + " insertions");


        
    }


    public static double timeInsertAtBegining(List<String> l, int numInsertions){

        long startTime = System.currentTimeMillis();
        Random rng = new Random();


        for(int i = 0; i < numInsertions; i++){
            // int index = rng.nextInt(0, Math.max(l.size(), 1));

            int index = 0;
            l.add(index, "inserted at index " + index); // prevent string pool caching I think?
        }

        long endTime = System.currentTimeMillis();


        return (startTime - endTime) / 1000.0;

    }
}