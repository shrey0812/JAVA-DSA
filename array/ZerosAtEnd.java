package array;

import java.util.Scanner;

public class ZerosAtEnd {
    public static void main(String[] args) {
        int n;int temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        // for(int i=0;i<n;i++){
        //     if(arr[i]==0){
        //         temp= arr[i];
        //         for(int j=i;j<n-1;j++){
        //             arr[j]=arr[j+1];
        //         }
        //         arr[n-1]=temp;
        //     }
        // }
        int j=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]!=0&&arr[j]==0){
                temp = arr[i];
                arr[i]= arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
         System.out.println("new array");
        for(int i= 0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
