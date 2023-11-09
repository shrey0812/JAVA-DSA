package LinkedList.doubleLL;

public class DoublyLinkedList {
    

    private ListNode head;
    private ListNode tail;
    private int length;

    private static class ListNode{

        private int data;
        private ListNode next;
        private ListNode previous;

        ListNode(int data){
            this.data=data;
        }
    }

    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }

    public boolean isEmpty(){
        return head==null;
    }

    public int length(){
        return length;
    }

    public void displayForward(){
        ListNode temp=head;
        if (head==null) {
            System.out.println("null");
            return;
        }else{
            while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.print("null");
        }
    }

    public void displayBackward(){
        ListNode temp=tail;
        if (head==null) {
            System.out.println("null");
        }else{
            while (temp!=null) {
            System.out.print(temp.data+" --> ");
            temp=temp.previous;
        }
        System.out.print("null");
        }
    }

    public void insertAtBegin(int data){
        ListNode newNode= new ListNode(data);
        if(isEmpty()){
            head=newNode;
            length++;
        }else{
            head.previous=newNode;
            newNode.next=head;
            head=newNode;
            length++;
        } 
    }

    public void insertAtLast(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()){
            head=newNode;
            length++;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
            tail=newNode;
            length++;
        }
    }
}
