public class LinkedList {

    private Node head;
    private Node tail;

    public void add(String item) {
        Node newItem = new Node(item);

        // handles the case where the new item
        // is the only thing in the list
        if (head == null) {
            head = newItem;
            tail = newItem;
            return;
        }

        tail.next = newItem;
        tail = newItem;
    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
        }
    }

    public void insertRec(String valueToInsert, int index) {
        insertHelper(valueToInsert, index, this.head, 0);
    }

    private void insertHelper(
        String valueToInsert,
        int index,
        Node current,
        int timesMoved
    ) {
        if (timesMoved == index) {
            // do insert stuff
            Node newNode = new Node(valueToInsert);
            newNode.next = current.next;

            current.next = newNode;
        }

        if (current.next != null) {
            insertHelper(valueToInsert, index, current.next, timesMoved + 1);
        }
    }

    class Node {

        String item;
        Node next;

        public Node(String item) {
            this.item = item;
            this.next = null;
        }
    }
}
