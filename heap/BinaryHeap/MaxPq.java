package heap.BinaryHeap;

import java.util.Scanner;

public class MaxPq {
    private Integer[] heap;
    private int n;

    public MaxPq(int capacity){
        heap = new Integer[capacity+1];
        n=0;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }

    public void insert(int value){
        n++;
        heap[n] = value;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the capacity of the heap");
        int capacity = sc.nextInt();
        MaxPq maxPq = new MaxPq(capacity);
        int value;
        System.out.println("Enter the components of the heap");
        for (int i = 0; i < capacity; i++) {
            value = sc.nextInt();
            maxPq.insert(value);
        }
        System.out.println(maxPq.size());
        System.out.println(maxPq.isEmpty());
        sc.close();
    }
}
