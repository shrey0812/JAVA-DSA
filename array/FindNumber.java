package array;

import java.util.Scanner;

public class FindNumber{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int c=1;
        int index=0;
        for(int i=0;i<arr.length;i++){
            arr[i]=c;
            c++;
        }
        System.out.println("Enter the missing number");
        int a = sc.nextInt();
        for(int i= 0;i<arr.length;i++){
            if(arr[i]==a){
                index = i;
                break;
            }
        }
        if(index!=0){
            System.out.println("the missing number is at location "+ index);
        }
        else{
            System.out.println("not found");
        }
        sc.close();
    }
}