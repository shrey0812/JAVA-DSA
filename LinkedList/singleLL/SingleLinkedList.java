package LinkedList.singleLL;

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
    public void display(){
        ListNode current =head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null \n");
    }
    
    public int lengthOfList(){
        int count=0;
        if(head==null){
            return 0;
        }
        ListNode current =head;
        while (current!=null) {
            count++;
            current=current.next;
        }
        return count;
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
        sll.display();
        int count= sll.lengthOfList();
        System.out.println("The number of nodes in list is "+count);
    }
     
}
