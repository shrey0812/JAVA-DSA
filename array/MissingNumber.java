package array;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        int n;int flag=0;int arrSum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int sum = ((n+1)*(n+2))/2;
        for (int i = 0; i < n; i++) {
            arrSum= arrSum+arr[i];
        }
        flag= sum-arrSum;
        System.out.println("the missing number is "+flag);
        sc.close();
    }
}
