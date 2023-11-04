package array;

import java.util.Scanner;

public class RemoveEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers of elements in the array");
        int n= sc.nextInt();
        int arr[]=new int[n];
        int a=0;
        System.out.println("Enter the element of array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                a++;
            }
        }
        int[] b=new int[a];
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2!=0){
                b[count]=arr[i];
                count++;
            }
        }
        for(int i=0;i<a;i++){
            System.out.print(b[i]+" ");
        }
        sc.close();
    }
}
