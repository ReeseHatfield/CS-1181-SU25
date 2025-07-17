import java.util.*;
import java.io.*;

public class Driver {

    public static void main(String[] args) {
        
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