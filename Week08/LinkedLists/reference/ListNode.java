public class ListNode<T> {
    public T value;
    public ListNode<T> next = null;

    public ListNode(T value) {
        this.value = value;
    }

    public String toString(){
        return "[ " +  value + "]";
    }
}