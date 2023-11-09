package LinkedList.singleLL;

import java.util.Scanner;

public class OperatonOnTwoSortedSLL {
    private ListNode head;

    private class ListNode{

        private int data;
        private ListNode next;

        ListNode(int data){
            this.data = data;
            this.next=null;
        }
    }


            public ListNode merge(ListNode a, ListNode b){
            ListNode dummy = new ListNode(0);
            ListNode tail = dummy;
            while (a!=null&&b!=null) {
                if(a.data<=b.data){
                    tail.next=a;
                    a=a.next;
                }else{
                    tail.next=b;
                    b=b.next;
                }
                tail=tail.next;
            }
            if(a==null){
                tail.next=b;
            }else{
                tail.next=a;
            }
            return dummy.next;
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


        public void display(){
            ListNode currentListNode = head;
            while (currentListNode!=null) {
                System.out.print(currentListNode.data+" --> ");
                currentListNode=currentListNode.next;
            }
            System.out.print("null \n");
        }


        public ListNode addition(ListNode a, ListNode b){
            ListNode dummy = new ListNode(0);
            ListNode tail = dummy;
            while (a!=null&&b!=null) {
                tail.data = a.data+b.data;
                tail=tail.next;
            }
            if (a==null) {
                tail.next=b;
            }else{
                tail.next=a;
            }
            return dummy;
        }


        public static void main(String[] args) {
            OperatonOnTwoSortedSLL msll1 = new OperatonOnTwoSortedSLL();
            OperatonOnTwoSortedSLL mSll2 = new OperatonOnTwoSortedSLL();
            Scanner sc = new Scanner(System.in);
            int value =0;
            System.out.println("Enter the number of elements in first node");
            int n1 = sc.nextInt();
            System.out.println("Enter the elements of first node");
            for (int i = 0; i < n1; i++) {
                value=sc.nextInt();
                msll1.insertAtLast(value);
            }
            System.out.println("Enter the number of elements in second node");
            int n2 = sc.nextInt();
            System.out.println("Enter the elements of second node");
            for (int i = 0; i < n2; i++) {
                value=sc.nextInt();
                mSll2.insertAtLast(value);
            }
            // OperatonOnTwoSortedSLL merged = new OperatonOnTwoSortedSLL();
            // merged.head= merged.merge(msll1.head, mSll2.head);
            // merged.display();
            OperatonOnTwoSortedSLL added = new OperatonOnTwoSortedSLL();
            added.head = added.addition(msll1.head, mSll2.head);
            sc.close();
        }
    }

