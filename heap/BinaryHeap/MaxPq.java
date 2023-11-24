package heap.BinaryHeap;

public class MaxPq {
    Integer[] heap;
    int n;

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

    public static void main(String[] args) {
        MaxPq maxPq = new MaxPq(3);
        System.out.println(maxPq.size());
        System.out.println(maxPq.isEmpty());
    }
}
