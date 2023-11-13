package Queue;

public class QueueUsingLinkedList {
    
    private ListNode front;
    private ListNode rear;
    private int length;


    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            next=null;
        }
    }

    QueueUsingLinkedList(){
        length=0;
        front=null;
        rear=null;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void enqueue(int data){
        ListNode temp = new ListNode(data);
        if(isEmpty()){
            front=temp;
            rear=temp;
            length++;
        }
        else{
            rear.next=temp;
            rear=temp;
            length++;
        }
    }
}
