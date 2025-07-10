import java.util.List;
import java.util.Stack;

public class Driver {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // ll.add("Hello");
        // ll.add("World");
        // ll.add("my");
        // ll.add("name");
        // ll.add("is");
        // ll.add("Reese");

        // ll.insertRec("Clarissa", 4);

        // ll.print();
        //
        //

        System.out.println(pairStar("aaa"));
        System.out.println(isPalindrome("racecare"));
    }

    // move 'x's to end of string
    public String endX(String str) {
        if (str.length() == 0) {
            return str;
        }

        if (str.charAt(0) == 'x') {
            return endX(str.substring(1)) + "x";
        } else {
            return String.valueOf(str.charAt(0)) + endX(str.substring(1));
        }
    }

    // not a coding bat one
    public static void printTriangle(int currentHeight, int targetHeight) {
        if (currentHeight == targetHeight) {
            return;
        }

        for (int i = 0; i < currentHeight; i++) {
            System.out.print("*");
        }
        System.out.println();

        printTriangle(currentHeight + 1, targetHeight);
    }

    public static boolean isPalindrome(String s) {
        if (s.length() <= 1) {
            return true;
        }

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        boolean result = isPalindrome(s.substring(1, s.length() - 1));

        return result;
    }

    // count 11s
    public static int array11(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }

        int numToAdd = 0;
        if (nums[index] == 11) {
            numToAdd = 1;
        }

        return numToAdd + array11(nums, index + 1);
    }

    public static String pairStar(String str) {
        if (str.length() <= 1) {
            return str;
        }

        if (str.charAt(0) == str.charAt(1)) {
            return (
                String.valueOf(str.charAt(0)) + "*" + pairStar(str.substring(1))
            );
        } else {
            return String.valueOf(str.charAt(0) + pairStar(str.substring(1)));
        }
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, high);
        } else {
            return binarySearch(arr, target, low, mid - 1);
        }
    }
}
