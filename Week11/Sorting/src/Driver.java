import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        return null;
    }

    // dont do this part in class, assume working
    public static ArrayList<Integer> merge(
        ArrayList<Integer> left,
        ArrayList<Integer> right
    ) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0,
            j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }

        while (i < left.size()) result.add(left.get(i++));
        while (j < right.size()) result.add(right.get(j++));

        return result;
    }

    public static void main(String[] args) {}
}
