package searching;

import java.util.Scanner;

public class LinearSearch {

    public boolean search(int k,int arr[]){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array");
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter key to be searched");
        int k=sc.nextInt();
        boolean result = ls.search(k, arr);
        System.out.println(result);
        sc.close();
    }
}
