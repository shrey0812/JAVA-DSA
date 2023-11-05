package LinkedList;

public class SingleLinkedList {
    
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
            this.data = data;
            this.next= null;
        }
    }
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        sll.head= new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        sll.head.next= second;
        second.next= third;
        third.next= fourth;

        ListNode current =sll.head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    } 
}
