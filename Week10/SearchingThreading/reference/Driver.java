import java.io.*;
import java.util.*;

public class Driver {


    public static int operationsPerformed = 0;


    public static void main(String[] args) throws FileNotFoundException {
        

        Thread t1 = new CountingThread(100);


        t1.start();

        System.out.println("End of main");

        // writeRandomList(1000);
        // ArrayList<Integer> list = readListFromFile();



        // // System.out.println(list);

        // // linearSearch(list, 78);

        // Collections.sort(list);
        // binarySearch(list, 78, 0, list.size());
        
    }


    public static int binarySearch(ArrayList<Integer> searchMe, int target, int left, int right) {
        System.out.print("left=" + left);
        System.out.println(" right=" + right);
        if(left > right) {
            return -1;
        }

        int midpoint = left + (right - left) / 2;

        if (searchMe.get(midpoint) == target){
            
            System.out.println("Found " + target + " at index " + midpoint);
            System.out.println("Operations performed: " + operationsPerformed);
            return midpoint;
        }

        operationsPerformed++;
        if (searchMe.get(midpoint) > target) {
            return binarySearch(searchMe, target, left, midpoint - 1);
        } else {
            return binarySearch(searchMe, target, midpoint + 1, right);
        }

    }

    
    public static int linearSearch(ArrayList<Integer> searchMe, int target){

        for(int index = 0; index < searchMe.size(); index++) {
            operationsPerformed++;

            if(searchMe.get(index) == target) {
                System.out.println("Found " + target + " at index " + index);
                System.out.println("Operations performed: " + operationsPerformed);
                return index;
            }
            
        }

        
        return -1;
    }                                                                                                                                           

    public static ArrayList<Integer> readListFromFile() throws FileNotFoundException {
        
        ArrayList<Integer> list = new ArrayList<>();

        Scanner scnr = new Scanner(new File("nums.txt"));
        for(String s = scnr.nextLine(); scnr.hasNextLine(); s = scnr.nextLine()){
            list.add(Integer.parseInt(s));
        }
        scnr.close();

        return list;
    }

    public static void writeRandomList(int size) {

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < size; i++) {
            list.add(i);
        }
        Collections.shuffle(list);

        try (PrintWriter pw = new PrintWriter(new File("nums.txt"))) {
        
            for(Integer num: list) {
                pw.print(num);
                pw.println();
            }
        
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
    }

}