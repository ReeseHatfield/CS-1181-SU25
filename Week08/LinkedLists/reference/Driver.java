public class Driver {
    public static void main(String[] args) {
        // ListNode<String> head = new ListNode<>();
        // head.value = "hello";
        

        // ListNode<String> n1 = new ListNode<>();
        // n1.value = "world";
        // head.next = n1;

        // ListNode<String> n2 = new ListNode<>();
        // n2.value = "another string";
        // n1.next = n2;



        // System.out.println(head);
        // System.out.println(head.next);
        // System.out.println(head.next.next);


        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("hello");
        list.add("world");
        list.add("name");

        System.out.println(list.get(2));





    }
}