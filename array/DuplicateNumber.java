package array;

import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String args[]){
        int n;int count =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count>1)
            {
                System.out.println("the number repeating itself is "+ arr[i]);
            }
        }
        sc.close();
    }
}
