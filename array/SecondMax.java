package array;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        int n;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondMax=max;
                max = arr[i];
            }
            else if(arr[i]>secondMax&&arr[i]!=max){
                secondMax= arr[i];
            }
        }
        System.out.println("The second maximum number is "+secondMax);
        sc.close();
    }
}
