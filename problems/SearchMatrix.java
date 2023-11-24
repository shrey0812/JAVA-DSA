package problems;

import java.util.Scanner;

public class SearchMatrix {

    public void forSortedMatrix(int[][] arr, int n, int x){
        int i = 0;
        int j = n-1;
        while(i<n&&j>=0){
            if(arr[i][j]==x){
                System.out.println("Present");
                return;
            }
            if(arr[i][j]>x){
                j--;
            }
            else i++;
        }
        System.out.println("Not found");
    }
    public static void main(String[] args) {
        int[][] arr =  new int[4][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter components of matrix");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the key to be searched");
        int key = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(key==arr[i][j]){
                    System.out.println("Present at location "+i+","+j);
                    break; 
                }
            }
        }
        sc.close();
    }
}
