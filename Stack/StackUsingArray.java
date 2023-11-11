package Stack;

public class StackUsingArray {
    private int top;
    private int[] arr;

    public StackUsingArray(int capacity){
        top =-1;
        arr= new int[capacity];
    }

    public StackUsingArray(){
        this(10);
    }

    public int size(){
        return top+1;
    }

    public boolean isFull(){
        return arr.length==size();
    }

    public boolean isEmpty(){
        return top<0;
    }

    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is Full");
        }
        top++;
        arr[top]= data;
    }

    public void pop(){
        if(isEmpty()){
            throw new RuntimeException("No element to be popped");
        }
        top--;
    }

    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
