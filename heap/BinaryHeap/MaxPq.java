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
        heap[n]=value;
        swim(n);
    }

    private void swim(int k){
        while(k>1&& heap[k/2]<heap[k]){
            int temp = heap[k];
            heap[k]= heap[k/2];
            heap[k/2]=temp;
            k=k/2;
        }
    }


    public int deleteMax(){
        int max = heap[1];
        swap(1,n);
        n--;
        sink(1);
        heap[n+1]=null;
        return max;
    }

    public void swap(int a , int b){
        int temp = heap[a];
        heap[a]=heap[b];
        heap[b]=temp;
    }

    private void sink(int k){
        while(2*k<=n){
            int j = 2*k;
            if(j<n&&heap[j]<heap[j+1])
            j++;
            if(heap[k]>=heap[j])
            break;
            swap(k,j);
            k=j;
        }
    }

    
    public void display(){
        System.out.println("The elements of heap are");
        for (int i = 1; i < heap.length; i++) {
            System.out.print(heap[i]+" ");
        }
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
        maxPq.display();
        sc.close();
    }
}
