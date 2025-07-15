public class Driver {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.add("Alice");
        ll.add("Bob");
        ll.add("Charlie");
        ll.add("Cameron");
        ll.add("Dera");
        ll.add("Asher");


        ll.insert("Reese", 3);

        ll.print();

    }

    public static void printTriangle(int targetHeight){
        printTriangleHelper(10, 0);
    }


    private static void printTriangleHelper(int targetHeight, int currentHeight) {

        
        if(currentHeight == targetHeight) {
            return;
        }


        for(int i = 0; i < currentHeight; i++) {

            if(i == 0 || i == currentHeight - 1){
                System.out.print("*");
            }
            else {
                System.out.print(" ");
            }
        }
        System.out.println();


        printTriangleHelper(targetHeight, currentHeight + 1);


        return;
    }


    public static int count11s(int[] arr){
        return count11sHelper(arr, 0);
    }



    private static int count11sHelper(int[] arr, int index) {

        if(index == arr.length) {
            return 0; // something
        }


        // System.out.println(arr[index]);

        int numToAdd = 0;
        if(arr[index] == 11) {
            numToAdd = 1;
        }

        return numToAdd + count11sHelper(arr, index + 1);

    }
}