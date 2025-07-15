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

    public void insert(String value, int index) {
        insertHelper(value, index, head, 1);
    }


    private void insertHelper(String value, int index, Node current, int timesMoved){
        if(index == timesMoved) {
            // moving next values

            Node newNode = new Node(value);
            newNode.next = current.next;
            current.next = newNode;

        }

        if (current.next != null){

            insertHelper(value, index, current.next, timesMoved + 1);
        }


    }

    public void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.item);
            current = current.next;
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
