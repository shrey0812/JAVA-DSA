package array;

import java.util.Scanner;

public class MinimumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Enter the elements of an array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        int low=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<low){
                low = arr[i];
            }
            }
            System.out.println("The minimum value is "+low);
        sc.close();
        }
    }

