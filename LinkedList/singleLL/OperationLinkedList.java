package LinkedList.singleLL;

import java.util.Scanner;

public class OperationLinkedList {
    
    private ListNode head;

    private static class ListNode{
        
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data= data;
            this.next=null;
        }
    }

    public void insertAtBegin(int value){
        ListNode newnNode= new ListNode(value);
        newnNode.next=head;
        head=newnNode;
    }

    public void display(){
        ListNode currentListNode = head;
        while (currentListNode!=null) {
            System.out.print(currentListNode.data+" --> ");
            currentListNode=currentListNode.next;
        }
        System.out.print("null \n");
    }

    public void insertAtLast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        else{
            ListNode current =head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    
    public void insertAtPosition(int value,int position){
        ListNode newNode = new ListNode(value);
        int count =1;
        if(position==1){
            newNode.next=head;
            head=newNode;
        }
        else {
            ListNode current = head;
        while(count <position-1){
            current= current.next;
            count++;
        }
        newNode.next= current.next;
        current.next= newNode;
        }
        
    }

    public static void main(String[] args) {
        OperationLinkedList oll =new OperationLinkedList();
        Scanner sc = new Scanner(System.in);
        int value;
        System.out.println("Enter the number of nodes in List");
        int n = sc.nextInt();
        System.out.println("Enter the data in the nodes of the List");
        for(int i=0;i<n;i++){
            value = sc.nextInt();
            //oll.insertAtBegin(value);
            oll.insertAtLast(value);
        }
        oll.display();
        oll.insertAtPosition(13, 1);
        oll.display();
        sc.close();
    }
}
