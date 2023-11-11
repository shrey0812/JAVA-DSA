package Stack;

import java.util.Scanner;

public class StackUsingLinkedList {
    private ListNode top;
    private int lenght;

    private static class ListNode{
        private int data;
        private ListNode next;

        ListNode(int data){
            this.data=data;
        }
    }

    public void push(int data){
        ListNode newNode = new ListNode(data);
        newNode.next= top;
        top=newNode;
        lenght++;
    }

    public void pop(){
        top=top.next;
        lenght--;
    }

    public void display(){
        while (top!=null) {
            System.out.print(top.data+" --> ");
            top=top.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackUsingLinkedList sll= new StackUsingLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in stack");
        int n = sc.nextInt();
        int value=0;
        System.out.println("Enter the elements of stack");
        for (int i = 0; i < n; i++) {
            value=sc.nextInt();
            sll.push(value);
        }
        sll.display();
        sc.close();
    }
}
