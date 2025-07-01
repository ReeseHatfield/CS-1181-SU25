public class MyLinkedList<T> {

    private ListNode<T> head;

    public MyLinkedList(){
        head = null;
    }


    public T get(int index) {

        ListNode<T> current = this.head;
        for(int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.value;

    }


    public void add(T valueToAdd) {

        ListNode<T> newNode = new ListNode<>(valueToAdd);

        if(head == null) {
            head = newNode;
            return;
        }

        // how to iterate thru a list?
        ListNode<T> current = this.head;
        
        // move current to end
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;

    }

    public void insert(int index, T value) {
        ListNode<T> newNode = new ListNode<>(value);
    
        if(index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
    
        ListNode<T> current = head;
        for(int i = 0; i < index - 1; i++) {
            if(current == null){
                return;
            }
            current = current.next;
        }
    
        if(current == null) {
            return;
        }
    
        newNode.next = current.next;
        current.next = newNode;
    }
    


    public String toString() {
        String s = "[";


        ListNode<T> current = this.head;
        while(current != null) {
            s += current + " ";
            current = current.next;
        }

        s += "]";


        return s;
    }
}

