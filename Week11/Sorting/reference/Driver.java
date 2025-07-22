import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

    public static ArrayList<Integer> mergeSort(ArrayList<Integer> list) {
        if (list.size() < 2) {
            return new ArrayList<>(list);
        }

        int mid = list.size() / 2; // pick a midpoint to split list on

        // partition the list with that midpoint
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(
            list.subList    (mid, list.size())
        );

        // sort left a=and right
        ArrayList<Integer> sortedLeft = mergeSort(left);
        ArrayList<Integer> sortedRight = mergeSort(right);

        // return combined version of those
        return merge(sortedLeft, sortedRight);
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

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
            Arrays.asList(38, 25, 43, 3, 8, 83, 10)
        );

        ArrayList<Integer> sorted = mergeSort(list);
        System.out.println(sorted);
    }
}
