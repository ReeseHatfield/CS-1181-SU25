import java.util.*;
import java.io.*;

public class Driver {

    private static int operationsPerformed = 0;

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {



        // writeRandomList(10_000);

        // ArrayList<Integer> list = readListFromFile();
        // Collections.sort(list);


        // int index = indexOfRecursive(list, 705, 0, list.size() - 1);


        // System.out.println(index);
        // // int targetIndex = indexOfLinear(list, 36);

        // // System.out.println(targetIndex);
        // System.out.println("Operations performed: " + operationsPerformed);


        // operationsPerformed = 0;
        // index = indexOfLinear(list, 705);

        // System.out.println(index);
        // // int targetIndex = indexOfLinear(list, 36);

        // // System.out.println(targetIndex);
        // System.out.println("Operations performed: " + operationsPerformed);


        // t1.run(); // should never do
        CustomThread t1 = new CustomThread(1000, "one");
        t1.start();


        CustomThread t2 = new CustomThread(2000, "two");
        t2.start();

        CustomThread t3 = new CustomThread(5000," three");
        t3.start();



        
        
        t1.join();
        t2.join();
        t3.join();
        


        System.out.println("total: " + CustomThread.result);



        System.out.println("Reached bottom of main");

    }


        public static int indexOfRecursive(ArrayList<Integer> searchMe, int target, int left, int right){
            // recursive algo w/ two base cases
            
            if(left > right) {
                return -1;
            }


            operationsPerformed++;
            int midpointIndex = left + (right - left) / 2;
            if(searchMe.get(midpointIndex) == target) {
                return midpointIndex;
            }


            if (searchMe.get(midpointIndex) > target){
                return indexOfRecursive(searchMe, target, left, midpointIndex - 1);
            }
            else {
                return indexOfRecursive(searchMe, target, midpointIndex + 1, right);
            }



        }


    public static int indexOfLinear(ArrayList<Integer> searchMe, int target){

        for(int index = 0; index < searchMe.size(); index++){

            operationsPerformed++;
            if(searchMe.get(index) == target) {


                System.out.println("Found target " + target + " at index " + index);

                return index;
            }


        }


        return -1;
    }





    public static ArrayList<Integer> readListFromFile() throws FileNotFoundException {

        ArrayList<Integer> list = new ArrayList<>();

        Scanner scnr = new Scanner(new File("nums.txt"));
        for (String s = scnr.nextLine(); scnr.hasNextLine(); s = scnr.nextLine()) {
            list.add(Integer.parseInt(s));
        }
        scnr.close();

        return list;
    }

    public static void writeRandomList(int size) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        try (PrintWriter pw = new PrintWriter(new File("nums.txt"))) {

            for (Integer num : list) {
                pw.print(num);
                pw.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}