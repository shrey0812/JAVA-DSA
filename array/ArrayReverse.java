package array;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr= new int[n];
        int[] b=new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            System.out.println("print");
            b[count++]=arr[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
        sc.close();
    }
}
