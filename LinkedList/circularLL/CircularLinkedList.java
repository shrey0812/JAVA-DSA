package LinkedList.circularLL;

import java.util.Scanner;

public class CircularLinkedList {
    private ListNode last;
    private int length;

    private class ListNode{
        private ListNode next;
        private int data;

       public ListNode(int data){
            this.data=data;
        }
    }

    CircularLinkedList(){
        last=null;
        length=0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return last==null;
    }

    public void insertAtBegin(int value){
        ListNode newNode= new ListNode(value);
        if(last==null){
            last=newNode;
            last.next=newNode;
            length++;
        }else{
            newNode.next=last.next;
            last.next=newNode;
            length++;
        }
    }

    public void display(){
        ListNode temp=last.next;
        if(last==null){
            return;
        }else{
            while (temp!=last) {
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println(last.data+" --> null");
        }   
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int value=0;
        System.out.println("Enter the number of elements in the list");
        int n= sc.nextInt();
        System.out.println("Enter elements in the list");
        for (int i = 0; i < n; i++) {
            value = sc.nextInt();
            cll.insertAtBegin(value);
        }
        cll.display();
        int c = cll.length();
        System.out.println(c);
        sc.close();
    }
}
